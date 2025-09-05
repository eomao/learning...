package LinkedList;

import java.util.NoSuchElementException;

public class SingleLinkedList<T>{
    private SingleNode<T> head;
    private SingleNode<T> tail;
    private int size;

    public SingleLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int size(){
        return size;
    }
    public void addFirst(T value){
        SingleNode<T> newNode = new SingleNode<>(value);
        if(isEmpty()){
            head = tail = newNode;
        }else {
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }
    public void addLast(T value){
        SingleNode<T> newNode = new SingleNode<>(value);
        if(isEmpty()){
            head = tail = newNode;
        }else {
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }
    public T removeFirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        T value = head.getValue();
        head = head.getNext();
        size--;
        if(isEmpty()){
            tail = null;
        }
        return value;
    }
    public T get(int index){
        if(index< 0 || index >= size){
            throw new NoSuchElementException();
        }
        SingleNode<T> node = head;
        for(int i = 0; i < index; i++){
            node = node.getNext();
        }
        return node.getValue();
    }
    public void clear(){
        head = null;
        tail = null;
        size = 0;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        SingleNode<T> node = head;
        while (node != null){
            sb.append(node.getValue());
            node = node.getNext();
            if(node != null){
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
