package LinkedList;

public class SingleNode<T> {
    private T value;
    private SingleNode<T> next;

    public SingleNode(T value){
        this.value = value;
        this.next = null;
    }

    public void setValue(T newValue){
        this.value = newValue;
    }

    public T getValue(){
        return this.value;
    }

    public void setNext(SingleNode<T> next){
        this.next = next;
    }

    public SingleNode<T> getNext(){
        return next;
    }

}
