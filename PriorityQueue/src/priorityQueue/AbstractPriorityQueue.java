package priorityQueue;


import java.util.Comparator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author manh2
 * @param <K>
 * @param <V>
 */
public abstract class AbstractPriorityQueue<K, V> implements PriorityQueue<K, V> {

    protected static class PQEntry<K, V> implements Entry<K, V> {

        private K k;
        private V v;

        public PQEntry(K key, V value) {
            k = key;
            v = value;
        }

        // phương thức của interface
        @Override
        public K getKey() {
            return k;
        }

        @Override
        public V getValue() {
            return v;
        }

        protected void setKey(K key) {
            k = key;
        }

        protected void setValue(V value) {
            v = value;
        }
        
        @Override
        public String toString(){
            return "(" +k + ", " + v + ")";
        } 
   }

    // Bộ so sánh khóa trong hàng đợi ưu tiên
    private Comparator<K> comp;

    //Tạo một hàng đợi ưu tiên trống bằng cách sử dụng bộ so sánh đã cho để sắp xếp các khóa
    protected AbstractPriorityQueue(Comparator<K> c) {
        comp = c;
    }

    //Tạo một hàng đợi ưu tiên trống dựa trên thứ tự tự nhiên của các khóa của nó
    protected AbstractPriorityQueue() {
        this(new DefaultComparator<K>());
    }

    //so sánh 2 entry theo khóa
    protected int compare(Entry<K, V> a, Entry<K, V> b) {
        return comp.compare(a.getKey(), b.getKey());
    }

    //Kiểm tra khóa hợp lệ
    protected boolean checkKey(K key) throws IllegalArgumentException {
        try {
            return (comp.compare(key, key) == 0);  // see if key can be compared to itself
        } catch (ClassCastException e) {
            throw new IllegalArgumentException("Incompatible key");
        }
    }

    //Kiểm tra xem hàng đợi ưu tiên trống
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

}
