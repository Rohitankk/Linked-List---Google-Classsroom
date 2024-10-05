package MyListInterface;

import java.util.NoSuchElementException;

public class SinglyLink<E> implements MyList<E> {
    public Node<E> start;
    private  int size = 0;

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void insert(E data) throws ListOverflowException {
        Node<E> temp = new Node<E>(data);
        temp.setData(data);
        temp.setNext(null);

        if(start == null) {
            start = new Node<E>(data);
        }else{
            Node<E> temp1 = start;
            while(temp1.next != null) {
                temp1 = temp1.next;
            }
            temp1.next = temp;
        }
        size++;
    }

    @Override
    public E getElement(E data) throws NoSuchElementException {
        return null;
    }



    public E getElement(int index){
        // If linked list is empty
        if (start == null) {
            System.out.println("The list is empty");
            return null;
        }
        // Store head node
        Node<E> temp = start;

        // If head needs to be removed
        if (index == 0)
        {
            return start.getData();
        }

        for (int i = 0; i < index; i++){
            temp = temp.getNext();
        }
        return temp.getData();
    }
    
    @Override
    public boolean delete(E data) {
        boolean i = false;

        Node<E> temp = null;

        for(Node<E> j = start; j != null; j = j.getNext()) {

            if(j.getData() == data) {
                size--;
                i = true;
                if (temp == null) {
                    start = j.getNext();
                } else {
                    temp.setNext(j.getNext());
                }
            } else {
                temp = j;
            }
        }
        return i;
    }
    
    @Override
    public boolean search(E data) {
        boolean i = false;
        Node<E> temp = start;

        while (temp != null) {
            if (data.equals(temp.getData())) {
                i = true;
                break;
            }
            temp = temp.getNext();
        }
        return i;
    }

    public void print(){
        if (start == null) {
            System.out.println("The list is empty");
            return;
        }
        Node<E> temp = start;
        int counter = 0;
        while(temp != null){
            System.out.print("["+ counter +"] " + temp.getData() + "\n");
            temp= temp.getNext();
            counter++;
        }
    }
}
