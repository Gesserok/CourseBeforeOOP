package course.java8.linkedStack;

import java.util.EmptyStackException;

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

    public class MyLinkedIterator {

    }

}
