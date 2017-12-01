package course.java8.linkedStack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

import static org.junit.Assert.*;

public class MyStackTest {
    private MyStack<String> myStack;

    @Before
    public void setUp() throws Exception {
        myStack = new LinkedStack();
    }

    @After
    public void tearDown() throws Exception {
        myStack = null;
    }

    @Test
    public void push() throws Exception {
        myStack.push("1");
        myStack.push("2");
        myStack.push("3");

        assertTrue(myStack.size() == 3);
    }

    @Test
    public void pop() throws Exception {
        myStack.push("1");
        myStack.push("2");
        myStack.push("3");

        myStack.pop();
        myStack.pop();
        myStack.pop();

        assertTrue(myStack.size() == 0);
    }
    @Test
    public void popNeg() throws Exception {
        try {
            myStack.pop();
        } catch (Exception e) {
            assertTrue(e instanceof EmptyStackException);
        }
    }

    @Test
    public void size() throws Exception {
    }

}