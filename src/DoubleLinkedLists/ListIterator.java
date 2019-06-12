package DoubleLinkedLists;
import DoubleLinkedLists.Node;
import java.util.Objects;

class ListIterator<T> implements MyIterable {

    private DoubleLinkedList<T> list;
    private Node<T> current;
    private Node<T> previous;

    public ListIterator(DoubleLinkedList list){
        this.list = list;
        this.reset();
    }

    public void reset(){
        this.current = this.list.getBegin();
        this.previous = null;
    }

    public void next(){
        if(this.atEnd()){
            throw new NullPointerException();
        }
        else{
            this.previous = this.current;
            this.current = this.current.next;
        }
    }

    public void back(){
        if(Objects.isNull(this.previous)){
            throw new NullPointerException();
        }
        this.previous = this.previous.previous;
        this.current = this.previous;

    }

    public Node<T> getCurrent(){
        if(Objects.isNull(this.current)){
            throw new NullPointerException();
        }
        return this.current;
    }

    private boolean atEnd(){
        return(Objects.isNull(current.next));
    }

    private void moveOn(int steps){
        for(int i = 0; i < steps; i ++)
            next();
    }

    public void insertAfter(int steps, T data){
        Node<T> node = new Node<T>(data);
        this.reset();
        moveOn(steps);
        //set links for new node
        node.next = this.current.next;
        node.previous = this.current;
        //set links to new node for next and former current nodes
        node.next.previous = node;
        this.current.next = node;
        //iterator shift
        next();
        this.list.increaseSize();

    }

    public void insertBefore(int steps, T data){
        Node<T> node = new Node<T>(data);
        this.reset();
        moveOn(steps);
        //set links for new node
        node.next = this.current;
        node.previous = this.current.previous;
        //set links to new node for next and former current nodes
        this.current.previous = node;
        this.previous.next =node;
        //iterator shift
        this.back();
        this.list.increaseSize();
    }

    public Node<T> deleteCurrent(){
        if(Objects.isNull(this.current)){
            throw new NullPointerException();
        }
        else{
            Node<T> deleted = this.current;
            this.previous.next = deleted.next;
            deleted.next.previous = this.previous;
            this.current = deleted.next;
            this.list.decreaseSize();
            return deleted;
        }
    }

}
