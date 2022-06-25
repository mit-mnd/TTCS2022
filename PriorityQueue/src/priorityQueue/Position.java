package priorityQueue;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author manh2
 * @param <E>
 */
public interface Position<E> {
    //trả về phần tử được lưu trữ tại vị trí này
    E getElement() throws IllegalStateException;
}
