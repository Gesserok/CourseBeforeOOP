package course.java8.linkedStack;

public interface MyStack<T> extends  Iterable<T>{

    void push(T o);
    T pop();
    int size();

}
