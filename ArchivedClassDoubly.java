import MyListInterface.DoublyLinkedNode;

public class ArchivedClassDoubly<T> extends DoublyLinkedNode<T> {

    public String subjectName = null;
    public String schedule = null;
    public int classNumber = 0;
    public boolean isEdited = false;

    public ArchivedClassDoubly<T> next;
    public ArchivedClassDoubly<T> previous;

    ArchivedClassDoubly(){
    }

}
