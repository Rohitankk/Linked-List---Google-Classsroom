import MyListInterface.DoublyLinkedNode;
import MyListInterface.MyDoublyLinkedList;

import java.util.Objects;
import java.util.Scanner;

public class Settings<T> extends MyDoublyLinkedList<T> {
    SettingsDoubly<T> head = null;
    SettingsDoubly<T> tail = null;

    public void insert(String settingName,String none) {
        SettingsDoubly<T> settings = new SettingsDoubly<>();
        ClassDoubly<T> newClassCode = new ClassDoubly<>();
        if (head == null) {
            settings.settingsName = settingName;
            newClassCode.subjectName = settingName;
            settings.settingNumber = 1;
            head = settings;
            tail = settings;
        } else {
            tail.next = settings;
            tail.next.prev = tail;
            tail = settings;
            settings.settingsName = settingName;
            newClassCode.subjectName = settingName;
            settings.settingNumber = tail.prev.settingNumber + 1;
        }

    }

    public boolean settingSwitch() {
        Scanner kbd = new Scanner(System.in);
        SettingsDoubly<T> trav = head;
        boolean switched = false;
        int decision;
        do {
            System.out.println("Select which settings to TURN ON or OFF (input the setting number)");
            System.out.println("PRESS 0 TO EXIT");
            decision = kbd.nextInt();
            while (trav.settingNumber != decision && trav.next != null) {
                trav = trav.next;
            }
            while (trav.settingNumber != decision && trav.prev != null) {
                trav = trav.prev;
            }
            if (trav.settingNumber == decision) {
                if (trav.switchSettings== "On") {
                    trav.switchSettings = "Off";
                } else {
                    trav.switchSettings = "On";
                }
            } else {
                System.out.println("Setting Number not found");
            }
            printClass();
        }while(decision != 0 );
        return switched;
    }

    public void printClass(){
        SettingsDoubly<T> trav = head;
        while (trav != null){
            System.out.printf("|          | %-20s %-50s %-50s \n",trav.settingNumber,trav.settingsName,trav.switchSettings+ "                                                                 |");
            trav = trav.next;
        }
    }
}
