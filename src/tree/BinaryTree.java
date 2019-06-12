package tree;

import java.util.Objects;

public class BinaryTree<T> {

    private Node<T> root;

    public Node<T> current;

    public class Node<T>{
        private int key;
        private T data;
        private Node<T> left;
        private Node<T> right;
        private void display(){
            System.out.println(this.key + " : " + this.data);
        }

        public Node(int key, T data){
            this.key = key;
            this.data = data;
        }
        public Node(){
            this.left = null;
            this.right = null;
        }

        public T getData(){
            return this.data;
        }
    }

    public Node<T> find(int key){
        Node<T> current = this.root;
        while(current.key != key){
            if(key < current.key)
                current = current.left;
            else
                current = current.right;
            if(Objects.isNull(current))
                return null;
        }
        return current;
    }

    public void insert(int key, T data){
        Node<T> newNode = new Node<T>(key,data);
        if(Objects.isNull(this.root)){
            this.root = newNode;
            return;
        }
        Node<T> cursor = this.root;
        Node<T> current;//variable for moving upon tree
        while(true){
            current = cursor;//variable for current node
            if (key < cursor.key){
                cursor = cursor.left;
                if(Objects.isNull(cursor)){
                    current.left = newNode;
                    break;
                }
            }
            else{
                cursor = cursor.right;
                if(Objects.isNull(cursor)){
                    current.right = newNode;
                    break;
                }
            }
        }
    }

    public void delete(){

    }

}
