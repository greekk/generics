package SimpleLinkedList;

public class Node<T> {
    public T Data;
    public Node<T> next;

    public Node(T data){
        this.Data = data;
        this.next = null;
    }

    public T getData(){
        return this.Data;
    }

}
