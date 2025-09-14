package LinkedList;

import java.util.NoSuchElementException;

public class DoubleLinkedList<T> {
    private DoubleNode<T> head;
    private DoubleNode<T> tail;
    int size;
    public DoubleLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int getSize(){
        return size;
    }
    public void addFirst(T value){
        DoubleNode<T> node = new DoubleNode<T>(value, null, head);
        if(isEmpty()){
            head = tail = node;
        }else{
            head.setPrev(node);
            head = node;
        }
        size++;
    }
    public void addLast(T value){
        DoubleNode<T> node = new DoubleNode<T>(value, tail, null);
        if (isEmpty()){
            head = tail = node;
        }else{
            tail.setNext(node);
            tail = node;
        }
        size++;
    }
    public T removeFirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        DoubleNode<T> node = head;
        if (size == 1){
            head = tail = null;
        }else {
            head = head.getNext();
            head.setPrev(null);
        }
        size--;
        return node.getValue();
    }
    public T removeLast(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        DoubleNode<T> node = tail;
        if (size == 1){
            head = tail = null;
        }else {
            tail = tail.getPrev();
            tail.setNext(null);
        }
        size--;
        return node.getValue();
    }
    public T getFirst(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        DoubleNode<T> node = head;
        return node.getValue();

    }
    public T getLast(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        DoubleNode<T> node = tail;
        return node.getValue();
    }
    public void print(){
        if (isEmpty()){
            System.out.println("리스트가 비어있습니다.");
            return;
        }
        DoubleNode<T> node = head;
        for(int i = 0; i < size; i++){
            System.out.println(node+" ");
            node = node.getNext();
        }
    }
}
