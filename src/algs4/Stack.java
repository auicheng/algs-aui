package algs4;

import edu.princeton.cs.algs4.*;
public class Stack<T> {

    private Node topNode;
    private int N;

    private class Node{
        T item;
        Node next;
    }

    public boolean isEmpty(){
        return topNode == null;
    }

    public int size(){
        return N;
    }

    public void pop(){
        return;
    }

    public void push(T item){

    }

}
