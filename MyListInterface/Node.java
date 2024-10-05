
package MyListInterface;

class Node<E> {
    public E data;
    protected Node<E> next;

    public Node(E data){
        this.data = data;
        next = null;
    }

    public E getData(){
        return data;
    }

    public void setNext(Node<E> t){
        this.next = t;
    }

    public Node<E> getNext(){
        return next;
    }

    public void setData(E data) {
        this.data = data;
    }
}
