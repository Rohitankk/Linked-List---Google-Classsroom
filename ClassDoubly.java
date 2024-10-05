import MyListInterface.DoublyLinkedNode;

public class ClassDoubly<T> extends DoublyLinkedNode<T> {

    public String subjectName = null;
    public String schedule = null;
    public int classNumber = 0;
    public boolean isEdited = false;

    public ClassDoubly<T> next;
    public ClassDoubly<T> previous;

    ClassDoubly(){
    }

}
