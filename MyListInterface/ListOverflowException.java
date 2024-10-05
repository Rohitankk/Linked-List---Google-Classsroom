package MyListInterface;

public class ListOverflowException extends Exception {
    public ListOverflowException(){super("list is full");}
    public ListOverflowException(String list_is_full) {super(list_is_full);}
}
