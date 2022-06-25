package priorityQueue;


import java.util.Iterator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author manh2
 * @param <E>
 */
public interface PositionalList<E> extends Iterable<E> {
    
    int size();


    boolean isEmpty();


    Position<E> first();


    Position<E> last();


    Position<E> before(Position<E> p) throws IllegalArgumentException;


    Position<E> after(Position<E> p) throws IllegalArgumentException;


    Position<E> addFirst(E e);


    Position<E> addLast(E e);


    Position<E> addBefore(Position<E> p, E e)throws IllegalArgumentException;


    Position<E> addAfter(Position<E> p, E e)throws IllegalArgumentException;


    E set(Position<E> p, E e) throws IllegalArgumentException;


    E remove(Position<E> p) throws IllegalArgumentException;


    @Override
    Iterator<E> iterator();


    Iterable<Position<E>> positions();
}
