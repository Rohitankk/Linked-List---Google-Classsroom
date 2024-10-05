import MyListInterface.DoublyLinkedNode;
import MyListInterface.MyDoublyLinkedList;

import java.util.Scanner;

public class ArchivedClasses<T> extends MyDoublyLinkedList<T> {
        ArchivedClassDoubly<T> head = null;
        ArchivedClassDoubly<T> tail = null;


        public void insert(String subjectName, int n) {
                ArchivedClassDoubly<T> newArchivedClass = new ArchivedClassDoubly<>();
                        if (head == null) {
                                newArchivedClass.subjectName = subjectName;
                                newArchivedClass.classNumber = 1;
                                head = newArchivedClass;
                                tail = newArchivedClass;
                        } else {
                                tail.next = newArchivedClass;
                                tail.next.previous = tail;
                                tail = newArchivedClass;
                                newArchivedClass.subjectName = subjectName;
                                newArchivedClass.classNumber = tail.previous.classNumber + 1;
                        }


        }


        public boolean delete(int number) {
                ArchivedClassDoubly<T> trav = head;

                if (head == null) {
                        System.out.println("List is empty");
                } else if (head.classNumber == number) {
                        head = null;
                        tail = null;
                } else if (tail.classNumber == number) {
                        tail.previous.next = null;
                        tail = tail.previous;
                } else {
                        while (trav.classNumber != number && trav.next != null) {
                                trav = trav.next;
                        }
                        if (trav.classNumber == number) {
                                trav.previous.next = trav.next;
                                trav.next.previous = trav.previous;
                                return true;
                        } else {
                                System.out.println("Classroom not found.");
                        }
                }
                return false;
        }

        public boolean editMain() {
                Scanner console = new Scanner(System.in);
                ArchivedClassDoubly<T> trav = head;
                boolean isEdited = false;
                int classNumber;

                System.out.print("Select which Class Number to edit (input Class Number): ");
                classNumber = console.nextInt();

                while (trav.classNumber != classNumber && trav.next != null) {
                        trav = trav.next;
                }
                System.out.print("Enter new Subject Name: ");
                String newName = console.nextLine();
                if (trav.classNumber != classNumber) {
                        trav.subjectName = newName;
                        isEdited = true;
                        trav.isEdited = true;

                } else {
                        System.out.println("Class number not found.");
                }
                return isEdited;
        }


        public void printClass() {
                ArchivedClassDoubly<T> trav = head;
                while (trav != null) {

                        System.out.println("|                                                                                                                                                       |");
                        System.out.println("|          ______________________________________________________________________________________________________________________________               |");
                        System.out.println("|          |                                                                                                                             |              |");
                        System.out.print("|          |  Class Number " + trav.classNumber + ": " + trav.subjectName + "                                                 ");

                        if (trav.isEdited) {
                                System.out.print("(Edited)  ");
                        }

                        System.out.println(
                                "\n|          |            "  +
                                        "\n|          |_____________________________________________________________________________________________________________________________|              |");
                        System.out.println("|                                                                                                                                                       |");
                        System.out.println("|                                                                                                                                                       |");
                        trav = trav.next;
                }
        }



}
