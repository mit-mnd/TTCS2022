package priorityQueue;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author manh2
 * @param <K>
 * @param <V>
 */
public interface PriorityQueue<K, V> {
    //return số lượng item
    int size();
    
    
    boolean isEmpty();
    
    Entry<K,V> insert(K key, V value) throws IllegalArgumentException;
    
    Entry<K,V> min();
    
    Entry<K,V> removeMin();
}
