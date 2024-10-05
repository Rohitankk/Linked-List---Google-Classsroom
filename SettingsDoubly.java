import MyListInterface.DoublyLinkedNode;
import MyListInterface.MyDoublyLinkedList;

public class SettingsDoubly<T> extends MyDoublyLinkedList<T>{
    public String settingsName = null;
    public boolean settingsSwitch = false;
    public String switchSettings = "On";
    public int settingNumber = 0;
    public SettingsDoubly<T> next;
    public SettingsDoubly<T> prev;

    SettingsDoubly(){

    }
}
