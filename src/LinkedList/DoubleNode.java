package LinkedList;


public class DoubleNode<T>{
    private DoubleNode<T> next;
    private DoubleNode<T> prev;
    private T value;
    public DoubleNode(T value, DoubleNode<T> prev, DoubleNode<T> next){
        this.prev = prev;
        this.next = next;
        this.value = value;
    }
    public void setNext(DoubleNode<T> newNext){
        next = newNext;
    }
    public void setValue(T newValue){
        value = newValue;
    }
    public void setPrev(DoubleNode<T> newPrev){
        prev = newPrev;
    }
    public DoubleNode<T> getNext(){
        return next;
    }
    public DoubleNode<T> getPrev(){
        return prev;
    }
    public T getValue(){
        return value;
    }

}
