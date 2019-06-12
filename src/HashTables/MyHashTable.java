package HashTables;

import java.util.Objects;

public class MyHashTable<K,T> {

    public int init_size = 16;

    private Node[] nodes = new Node[this.init_size];


    public void put(K key, T value){

        int hash = getHash(key);
        Node<K,T> node = new Node<K,T>(key, value);

        if (this.nodes[hash] == null) {
            this.nodes[hash] = node;
        }
        else{
            Node<K,T> current = nodes[hash];
            while(current.next != null){
                current =current.next;
            }
            current.next = node;
        }

    }

    public T get(K key){
        int hash = this.getHash(key);

        if(this.nodes[hash] != null){
            Node<K,T> current = this.nodes[hash];

            while(!current.key.equals(key) && current.next != null){
                current = current.next;
            }
            return current.value;
        }
        return null;
    }

    private int getHash(K key){
        return (key.hashCode() % this.init_size)&init_size-1;
    }

    private class Node<K, T>{
        K key;
        T value;
        Node<K,T> next;

        public Node(K key, T value){
            this.key = key;
            this.value = value;
            this.next = null;
        }

        @Override
        public String toString(){
            return "key " + " " + " value";
        }
    }

    @Override
    public String toString(){
        int bucket = 0;
        String hashTableString = "";
        for(Node<K,T> node : this.nodes){
            if(node == null)
                continue;
            hashTableString += "\n bucket[" + bucket + "] = " + node.toString();
            bucket++;
            Node<K,T> current = node.next;
            while(Objects.nonNull(current)){
                hashTableString += " -> " + current.toString();
                current = current.next;
            }
        }
        return hashTableString;
    }
}
