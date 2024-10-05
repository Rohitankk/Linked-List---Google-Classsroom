
import MyListInterface.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ClassroomSupp {
    public static SinglyLink<Classroom> classroomList = new SinglyLink<Classroom>();
    public static ArchivedClasses<String> archiveClassroom = new ArchivedClasses<String>();

    public static ArrayList<String> classes = new ArrayList<>();


    public static void Selection() throws ListOverflowException {
        Scanner kbd = new Scanner(System.in);
        System.out.println();
        int choice = 0;



        do {
            System.out.println("Classroom List");
            if (classroomList.getSize() == 0){
                System.out.println("The list is empty");
            } else {
                for (int i = 0; i < classroomList.getSize()  ; i++) {
                    if (classroomList.getElement(i) != null) {
                        System.out.println("[" + i + "] " + classroomList.getElement(i).getClassroomName());
                    }
                }
            }
            System.out.println("-------------------------------");
            System.out.println("Select From The Option: ");
            System.out.println("1. Open a classroom");
            System.out.println("2. Add a classroom");
            System.out.println("3. Remove a classroom");
            System.out.println("4. Search a person in a classroom");
            System.out.println("5. Back");
            System.out.print("Enter the number: ");
            choice = kbd.nextInt();
            while (choice < 1 || choice > 5 ){
                System.out.println("Invalid input! Select only from 1 - 5");
                System.out.print("Enter the number: ");
                choice = kbd.nextInt();
            }
            switch (choice) {
                case 1:
                    System.out.print("Enter the number of the classroom:");
                    int num = kbd.nextInt();
                    classroomChoice(classroomList.getElement(num));
                    break;
                case 2:
                    addClass();
                    break;
                case 3:
                    removeClassroom();
                    Selection();
                    break;
                case 4:
                    searchPeople();
                    break;
                case 5:
                    break;
            }

        }while (choice !=5 );
    }
    public static void addClass () throws ListOverflowException {
        Scanner kbd = new Scanner(System.in);
        Classroom newClassroom = new Classroom();
        System.out.print("Add Classroom name: ");
        String addSubjects = kbd.nextLine();
        classes.add(addSubjects);
        newClassroom.setClassroomName(addSubjects);
        classroomList.insert(newClassroom);


    }
    public static void addClasswork (Classroom classroom) throws ListOverflowException {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter classwork: ");
        String addClasswork = kbd.nextLine();
        classroom.getClasswork().insert(addClasswork);

        System.out.println("Format [Day-Month-Year] ex: 24-February-2022 ");
        System.out.print("Enter Due Date: ");
        String addDueDate = kbd.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        Date date2 = null;
        try {
            date2 = dateFormat.parse(addDueDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        classroom.getDueDate().insert(addDueDate);
    }

    public static void addPeople (Classroom classroom) throws ListOverflowException {
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter a name ");
        String addPeople = kbd.nextLine();
        classroom.getPeople().insert(addPeople);


    }
    public static void addStream (Classroom classroom) throws ListOverflowException {
        Scanner kbd = new Scanner(System.in);

        System.out.print("Post an announcement : ");
        String addStream = kbd.nextLine();
        classroom.getStream().insert(addStream);


    }
    public static void classroomChoice( Classroom classroom) throws ListOverflowException{
        Scanner kbd = new Scanner(System.in);
        System.out.println();
        int choice = 0;

        do {
            System.out.println(classroom.getClassroomName());
            System.out.println("-------------------------------");
            System.out.println("Select From The Option: ");
            System.out.println("1. Stream");
            System.out.println("2. Classwork");
            System.out.println("3. People");
            System.out.println("4. Back");
            choice = kbd.nextInt();
            switch (choice) {
                case 1:
                    stream(classroom);
                    break;
                case 2:
                    classwork(classroom);
                    break;
                case 3:
                    people(classroom);
                    break;
                case 4:
                    Selection();
            }

        }while (choice !=4 );

    }
    public static void stream(Classroom classroom) throws ListOverflowException{
        Scanner kbd = new Scanner(System.in);
        System.out.println();
        int choice = 0;

        do {
            System.out.println("Stream list");
            classroom.getStream().print();
            System.out.println("-------------------------------");
            System.out.println("Select From The Option: ");
            System.out.println("1. Add announcement");
            System.out.println("2. Delete announcement");
            System.out.println("3. Back");
            System.out.print("Enter the number: ");
            choice = kbd.nextInt();
            switch (choice) {
                case 1:
                    addStream(classroom);
                    break;
                case 2:
                    removeStream(classroom);
                    break;
                case 3:
                    classroomChoice(classroom);
                    break;
            }

        }while (choice !=3 );
    }
    public static void classwork(Classroom classroom) throws ListOverflowException{
        Scanner kbd = new Scanner(System.in);
        System.out.println();
        int choice = 0;

        do {
            System.out.println("List of classworks");
            classroom.getClasswork().print();
            System.out.println("-------------------------------");
            System.out.println("Select From The Option: ");
            System.out.println("1. Add classwork");
            System.out.println("2. Remove classwork");
            System.out.println("3. Back");
            System.out.print("Enter the number: ");
            choice = kbd.nextInt();
            switch (choice) {
                case 1:
                    addClasswork(classroom);
                    break;
                case 2:
                    removeClasswork(classroom);
                    break;
                case 3:
                    classroomChoice(classroom);
                    break;
            }

        }while (choice !=3 );
    }
    public static void people(Classroom classroom) throws ListOverflowException{
        Scanner kbd = new Scanner(System.in);
        System.out.println();
        int choice = 0;

        do {
            System.out.println("People");
            classroom.getPeople().print();
            System.out.println("-------------------------------");
            System.out.println("Select From The Option: ");
            System.out.println("1. Add people");
            System.out.println("2. Remove people");
            System.out.println("3. Back");
            System.out.print("Enter the number: ");
            choice = kbd.nextInt();
            switch (choice) {
                case 1:
                    addPeople(classroom);
                    break;
                case 2:
                    removePeople(classroom);
                    break;
                case 3:
                    classroomChoice(classroom);
                    break;
            }

        }while (choice !=3 );
    }

    public static void removeClassroom() throws ListOverflowException{

        Scanner kbd = new Scanner(System.in);
        if (classroomList.getSize() != 0){
            System.out.println();
            int choice =  0;
            System.out.print("Enter the index of the classroom: ");
            choice = kbd.nextInt();
            while (choice < 0 || choice > classroomList.getSize() -1){
                System.out.println("Invalid! Select only from the list range ");
                System.out.print("Enter the index of the classroom: ");
                choice = kbd.nextInt();
            }
            archiveClassroom.insert(classes.get(choice).toString(), 1);
            classes.remove(choice);
            classroomList.delete(classroomList.getElement(choice));
        } else {
            System.out.println("\nThere are no classrooms to be deleted");
        }
    }

    public static void removeStream(Classroom classroom) throws ListOverflowException{
        Scanner kbd = new Scanner(System.in);
        if (classroom.getStream().getSize()!= 0) {
            System.out.println();
            int choice =  0;
            System.out.print("Enter the index of the announcement");
            choice = kbd.nextInt();
            while (choice < 0 || choice > classroom.getStream().getSize() -1){
                System.out.println("Invalid! Select only from the list range ");
                System.out.print("Enter the index of the announcement: ");
                choice = kbd.nextInt();
            }
            classroom.getStream().delete(classroom.getStream().getElement(choice));
        } else {
            System.out.println("\nThere are no announcements to be deleted");
        }
        stream(classroom);
    }

    public static void removePeople(Classroom classroom) throws ListOverflowException{
        Scanner kbd = new Scanner(System.in);
        if (classroom.getPeople().getSize() != 0){
            System.out.println();
            int choice =  0;
            System.out.print("Enter the index of the person to remove: ");
            choice = kbd.nextInt();
            while (choice < 0 || choice > classroom.getPeople().getSize() -1){
                System.out.println("Invalid! Select only from the list range ");
                System.out.print("Enter the index of the person to remove: ");
                choice = kbd.nextInt();
            }
            classroom.getPeople().delete(classroom.getPeople().getElement(choice));
        } else {
            System.out.println("\nThere are no person to be deleted");
        }
        people(classroom);

    }

    public static void removeClasswork(Classroom classroom) throws ListOverflowException{
        Scanner kbd = new Scanner(System.in);
        if (classroom.getClasswork().getSize() != 0){
            System.out.println();
            int choice =  0;
            System.out.print("Enter the index of the classwork to remove: ");
            choice = kbd.nextInt();
            while (choice < 0 || choice > classroom.getClasswork().getSize() -1){
                System.out.println("Invalid! Select only from the list range ");
                System.out.print("Enter the index of the classwork to remove: ");
                choice = kbd.nextInt();
            }
            classroom.getClasswork().delete(classroom.getClasswork().getElement(choice));
        } else {
            System.out.println("\nThere are no classworks to be deleted");
        }
        classwork(classroom);
    }

    public static void searchPeople() throws ListOverflowException{
        Scanner kbd = new Scanner(System.in);
        SinglyLink<String> list = new SinglyLink<>();
        String name = "";
        System.out.print("Enter a name: ");
        name = kbd.nextLine();

        for (int i = 0; i < classroomList.getSize(); i++){
            for (int j = 0; j < classroomList.getElement(i).getPeople().getSize(); j++){
                if (classroomList.getElement(i).getPeople().search(name)){
                    list.insert(classroomList.getElement(i).getClassroomName());
                    break;
                }
            }
        }
        if (list.getSize()== 0) {
            System.out.println("\nThe name is not found\n");
        } else {
            System.out.println("The person exist in these classrooms:");
            for (int k = 0; k < list.getSize(); k++){
                System.out.print(list.getElement(k).toString()+ ", ");
            }
            System.out.println("\n");
        }
    }

}