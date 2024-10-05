package MyListInterface;

import java.util.NoSuchElementException;

public class MyDoublyLinkedList<T> implements MyList<T> {
    DoublyLinkedNode<T> head = null;
    DoublyLinkedNode<T> tail = null;



    @Override
    public int getSize() {
        int counter = 0;
        DoublyLinkedNode<T> n = head;
        while (n != null){

            if (n.data != null) {
                counter++;
            }

            n = n.next;
        }

        return counter;
    }

    @Override
           /* a method that creates a node with a data of T data,
    and links it accordingly to the DoublyLinkedList
     */
    public void insert(T data) {
        DoublyLinkedNode<T> newNode = new DoublyLinkedNode<>(data);

        if (head == null){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail.next.previous = tail;
            tail = newNode;
        }

    }
    @Override
    public T getElement(T data) throws NoSuchElementException {
        DoublyLinkedNode<T> n = head;
        while (n.data != data && n.next != null){
            n = n.next;
        }

        try{
            if (n.data == data){
                return n.data;
            } else {
                throw new NoSuchElementException();
            }
        } catch (NoSuchElementException msg){
            System.out.println("Element not found, exception occurred: " + msg);
        }

        return null;
    }

    @Override
    /* Deletes the first node found with T data, otherwise if T data is not found,
    returns false
     */
    public boolean delete(T data) {
        DoublyLinkedNode<T> trav = head;
        while (trav.data != data && trav.next != null){
            trav = trav.next;
        }

        if (trav.data == data){
            trav.previous.next = trav.next;
            trav.next.previous = trav.previous;
            return true;
        }
        return false;
    }

    @Override
    public boolean search(T data) {
        boolean i = false;
        DoublyLinkedNode<T> temp = head;

        while (temp != null) {
            if (data.equals(temp.data)) {
                i = true;
                break;
            }
            temp = temp.getNext();
        }
        return i;
    }

    void printElements(){
        DoublyLinkedNode<T> trav = head;
        while (trav != null){
            System.out.print(trav.data + " ");
            trav = trav.next;
        }
    }

}
