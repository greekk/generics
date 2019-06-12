package SimpleLinkedList;

import java.util.Objects;

public class SimpleLinkedList<T> {
    //reference to the first element
    private Node<T> head;
    private long size;

   //constructor
    public SimpleLinkedList(T ... args){
        if(args!= null){
            for(int i = 0; i < args.length; i++){
                this.insert(args[i]);
            }
        }
        else {
            this.head = null;
        }
    }
    //check for emptyness of list
    public boolean isEmpty(){
        return (this.head == null);
    }

    //insert element(node)
    public void insert(T data){
        Node<T> node = new Node<T>(data);
        if(!Objects.isNull(head))
            node.next = head;
        head = node;
        size++;

    }
    //delete element
    public Node<T> delete() throws NullPointerException{
        if(Objects.isNull(this.head))
            throw new NullPointerException();
        else
        {
            Node<T> tmp = head;
            head = head.next;
            size--;
            return tmp;
        }
    }
    // display entire List
    public void display(){
        Node<T> current = head;
        while(current != null){
            System.out.println(current.getData());
            current = current.next;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleLinkedList<T> list = (SimpleLinkedList<T>) o;
        return size == list.size && Objects.equals(this.head, list.head);
    }

    @Override
    public int hashCode() {
        return Objects.hash(head, size);
    }
}

