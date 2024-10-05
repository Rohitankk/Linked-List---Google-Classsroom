package MyListInterface;

public class DoublyLinkedNode<T> {
    public T data;
    public DoublyLinkedNode<T> next;
    public DoublyLinkedNode<T> previous;

    // constructors

    public DoublyLinkedNode() {

    }


    public DoublyLinkedNode (T data){
        this.data = data;
        next = null;
        previous = null;
    }

    DoublyLinkedNode (T data, DoublyLinkedNode<T> nextNode){
        this.data = data;
        previous = null;
    }



    DoublyLinkedNode<T> getNext(){
        return next;
    }

    DoublyLinkedNode<T> getPrevious(){
        return previous;
    }

    void setData(T data){
        this.data = data;
    }

    void setNext(DoublyLinkedNode<T> nextNode){
        next = nextNode;
    }

    void setPrevious(DoublyLinkedNode<T> previousNode){
        previous = previousNode;
    }


}
