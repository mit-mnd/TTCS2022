package priorityQueue;



import java.util.Comparator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author manh2
 */
public class UnsortedPriorityQueue<K, V> extends AbstractPriorityQueue<K, V> {

    //tập hợp các entry của hàng đợi ưu tiên
    private PositionalList<Entry<K, V>> list = new LinkedPositionalList<>();

    //tạo hàng đợi ưu tiên trống dựa trên thứ tự tự nhiên của các khóa
    public UnsortedPriorityQueue() {
        super();
    }
    
    // tạo hàng đợi ưu tiên trống sử dụng bộ so sánh
    public UnsortedPriorityQueue(Comparator<K> comp) {
        super(comp);
    }
    
    //trả về vị trí entry có khóa nhỏ nhất
    private Position<Entry<K, V>> findMin() {
        Position<Entry<K, V>> small = list.first();
        for (Position<Entry<K, V>> walk : list.positions()) {
            if (compare(walk.getElement(), small.getElement()) < 0) {
                small = walk;
            }
        }
        return small;
    }
    
    //chèn 1 cặp khóa-giá trị và trả về entry đã tạo
    @Override
    public Entry<K, V> insert(K key, V value) throws IllegalArgumentException {
        checkKey(key);
        Entry<K, V> newest = new PQEntry<>(key, value);
        list.addLast(newest);
        return newest;
    }

    //trả về entry có khóa tối thiểu (không xóa)
    @Override
    public Entry<K, V> min() {
        if (list.isEmpty()) {
            return null;
        }
        return findMin().getElement();
    }

    //trả về entry có khóa tối thiểu và xóa nó khỏi hàng đợi ưu tiên
    @Override
    public Entry<K, V> removeMin() {
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(findMin());
    }

    @Override
    public int size() {
        return list.size();
    }
}
