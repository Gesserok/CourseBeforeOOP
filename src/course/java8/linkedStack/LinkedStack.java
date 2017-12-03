package course.java8.linkedStack;

import java.util.EmptyStackException;
import java.util.Iterator;

public class LinkedStack<E> implements MyStack<E> {

    private Node<E> top;
    private int size;

    public LinkedStack() {
    }

    @Override
    public void push(E o) {
        top = new Node<>(o, top);
        size++;
    }

    @Override
    public E pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        E forRet = top.getValue();
        top = top.getNext();
        size--;
        return forRet;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyLinkedIterator<>();
    }


    public class MyLinkedIterator<E> implements Iterator<E>{
        private Node<E> curr;

        @Override
        public E next() {
            E forRet = curr.getValue();
            curr = curr.getNext();
            return forRet;
        }
        @Override
        public boolean hasNext(){
            return curr != null;
        }

    }

}
