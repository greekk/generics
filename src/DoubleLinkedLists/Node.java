package DoubleLinkedLists;

public class Node<T> {
    public T Data;
    public Node<T> next;
    public Node<T> previous;

    public Node(T data){
        this.Data = data;
        this.next = null;
        this.previous = null;
    }

    public T getData(){
        return this.Data;
    }

}
