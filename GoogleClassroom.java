import MyListInterface.ListOverflowException;
import MyListInterface.SinglyLink;

import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class GoogleClassroom extends ClassroomSupp {

    public static void main(String[] args) throws ListOverflowException {

        System.out.println("---------------------------");
        System.out.println("Welcome to Google Classroom");
        System.out.println("---------------------------");

        Classroom classroom1 = new Classroom();
        classroom1.setClassroomName("Mathematics");
        classes.add("Mathematics");
        Classroom classroom2 = new Classroom();
        classroom2.setClassroomName("Science");
        classes.add("Science");
        Classroom classroom3 = new Classroom();
        classroom3.setClassroomName("Filipino");
        classes.add("Filipino");
        Classroom classroom4 = new Classroom();
        classroom4.setClassroomName("English");
        classes.add("English");
        Classroom classroom5 = new Classroom();
        classroom5.setClassroomName("Computer Technology");
        classes.add("Computer Technology");
        Classroom classroom6 = new Classroom();
        classroom6.setClassroomName("Research");
        classes.add("Research");
        classroomList.insert(classroom1);
        classroomList.insert(classroom2);
        classroomList.insert(classroom3);
        classroomList.insert(classroom4);
        classroomList.insert(classroom5);
        classroomList.insert(classroom6);
        mainMenu();
    }

    public static void mainMenu() throws ListOverflowException {
        Scanner type = new Scanner(System.in);
        Settings<String> settings = new Settings<>();
        settings.insert("     Allow email Notifications","");
        settings.insert("     Comments on your posts","");
        settings.insert("     Comments that mention you","");
        settings.insert("     Work and posts from teachers ","");
        settings.insert("     Returned work and grades from your teachers","");
        settings.insert("     Invitation to join classes as student","");
        settings.insert("     Due-date reminders for your work","");


        int choice;
        int choices;


        do {
            menu();
            choice = enterChoice(1, 6);
            switch (choice) {
                // Classes Menu
                case 1: {
                    ClassroomSupp.Selection();
                    break;
                }
                case 2: {
                    System.out.println();

                    Scanner input = new Scanner(System.in);
                    System.out.print("Enter a month: ");
                    int m = input.nextInt();

                    System.out.print("Enter a Year: ");
                    int y = input.nextInt();
                    printMonth(y, m);


                    currentDateTime();

                    break;
                }
                // To-do Menu
                case 3: {

                    System.out.println();
                    do {
                        todoMenu();
                        choice = enterChoice(1,4);
                        switch (choice) {
                            case 1:
                                // Assigned
                                System.out.println();

                                do{
                                    assignedMenu();
                                    choice = enterChoice(1,6);
                                    switch (choice){
                                        case 1: // No Due Date
                                            System.out.println("Prelim Lec Activity 8 \t\t9/16");
                                            System.out.println("IT 212 - Network Fundamentals\n");
                                            System.out.println("Prelim Lec Activity 2 \t\t6/24");
                                            System.out.println("IT 212 - CFE\n");
                                            break;

                                        case 2: // Done Early
                                            System.out.println("Midterm Lec Activity 1 \t\t9/10");
                                            System.out.println("IT 212 - Data Structures\n");
                                            System.out.println("Prelim Lab Activity 2 \t\t8/10");
                                            System.out.println("IT 212 - Data Structures\n");

                                        case 3: // This Week
                                            System.out.println("Prelim Lec Activity 1 \t\t9/10");
                                            System.out.println("IT 212 - Data Structures\n");
                                            System.out.println("Prelim Lec Activity 2 \t\t8/10");
                                            System.out.println("IT 212 - Data Structures\n");
                                        case 4: // Last Week
                                            System.out.println("Prelim Lec Activity 1 \t\t9/10");
                                            System.out.println("IT 212 - Data Structures\n");
                                            System.out.println("Prelim Lec Activity 2 \t\t8/10");
                                            System.out.println("IT 212 - Data Structures\n");
                                        case 5: // Earlier
                                            System.out.println("Prelim Lec Activity 1 \t\t9/10");
                                            System.out.println("IT 212 - Data Structures\n");
                                            System.out.println("Prelim Lec Activity 2 \t\t8/10");
                                            System.out.println("IT 212 - Data Structures\n");
                                            break;
                                        case 6: // back
                                            break;
                                    }
                                }while (choice != 6);
                                break;
                            case 2:// Missing
                                System.out.println();

                                do{
                                    missing();
                                    choice = enterChoice(1,4);
                                    switch (choice){
                                        case 1: // This Week
                                            System.out.println("No Missing\n");
                                            break;

                                        case 2: // Last Week
                                            System.out.println("No Missing\n");

                                            break;

                                        case 3: // Earlier
                                            System.out.println("No Missing\n");
                                            break;
                                        case 4:
                                            // back
                                            break;
                                    }
                                }while (choice != 4);


                                break;
                            case 3:

                                // Done
                                do{
                                    doneMenu();
                                    choice = enterChoice(1,6);
                                    switch (choice){
                                        case 1: // No Due Date
                                            System.out.println("0\n");
                                            break;

                                        case 2: // Done Early
                                            System.out.println("0\n");
                                            break;

                                        case 3: // This Week
                                            System.out.println("0\n");
                                            break;
                                        case 4: // Last Week
                                            System.out.println("0\n");
                                            break;
                                        case 5: // Earlier
                                            System.out.println("Prelim Lec Activity 1 \t\t9/10");
                                            System.out.println("IT 212 - Data Structures\n");
                                            System.out.println("Prelim Lec Activity 2 \t\t8/10");
                                            System.out.println("IT 212 - Data Structures\n");
                                            break;
                                        case 6: // back
                                            break;
                                    }
                                }while (choice != 6);
                                break;
                            case 4: // back

                                break;

                        }

                    }while(choice != 4);

                    break;
                }
                // Archived Classes Menu
                case 4: {
                    showArchived(archiveClassroom);
                    archivedMenu();
                    choices = enterChoice(1, 4);
                    switch (choices) {
                        case 1: {
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
                            removeClassroom();
                            showArchived(archiveClassroom);
                            break;
                        }
                        case 2: {
                            if (archiveClassroom.editMain()) {
                                showArchived(archiveClassroom);
                                System.out.println(" ");
                                System.out.println("Edit successful");
                            }
                            break;
                        }
                        case 3: {
                            int postNumber;
                            System.out.print("Input class number of the subject to delete: ");
                            postNumber = type.nextInt();

                            if (archiveClassroom.delete(postNumber)) {
                                showArchived(archiveClassroom);
                                System.out.println(" ");
                                System.out.println("Class Subject deleted");
                            }
                            break;
                        }
                        case 4: {
                            break;
                        }
                    }
                    break;
                } // end of Archived Classes Menu

                // Settings Menu
                case 5: {
                    showSettings(settings);
                    settingsMenu();
                    choices = enterChoice(1, 4);
                    switch (choices) {
                        case 1:
                            if (settings.settingSwitch()) {
                                showSettings(settings);
                                System.out.println("Settings have been saved");
                            }
                            break;
                        case 2:
                            break;
                    }
                    System.out.println();
                    break;
                }
                case 6:
                    System.exit(0);
            }
        }while (choice != 6);
    }


    public static void menu() {
        System.out.println();
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("GOOGLE CLASSROOM");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("1. Classes");
        System.out.println("2. Calendar");
        System.out.println("3. To-do");
        System.out.println("4. Archived Classes");
        System.out.println("5. Settings");
        System.out.println("6. Exit");
        System.out.println("---------------------------------------------------------------------------");
    }

    public static int enterChoice(int min, int max) {
        Scanner k = new Scanner(System.in);
        int choice;
        do {
            System.out.print("Input the number of your choice: ");
            choice = k.nextInt();
            if (choice < min || choice > max)
                System.out.println("Invalid choice. Please ensure that you enter a number from " +
                        min + " to " + max + ".");
        } while (choice < min || choice > max);
        return (choice);
    }

    public static void classesMenu() {
        System.out.println();
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("CLASSES MENU");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("1. Add Class Code");
        System.out.println("2. Update Class Code");
        System.out.println("3. Delete Class Code");
        System.out.println("3. Search a Person");
        System.out.println("5. Back");
    }

    public static void archivedMenu() {
        System.out.println();
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("ARCHIVED CLASSES MENU");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("1. Archive Class Code");
        System.out.println("2. Update Archived Class Code");
        System.out.println("3. Delete Archived Class Code");
        System.out.println("4. Back");
    }

    public static void settingsMenu() {
        System.out.println();
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("GOOGLE CLASSROOM SETTINGS MENU");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("1. Edit Settings");
        System.out.println("2. Back");
    }

    static void showArchived(ArchivedClasses<String> archived) {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("________________________________________________________________________________________________________________________________________________________");
        System.out.println("|                                                                                                                                                       |");
        System.out.println("|    Google Classroom                                                                                                               Archived Classes    |");
        System.out.println("|_______________________________________________________________________________________________________________________________________________________|");
        System.out.println("|                                                                                                                                                       |");
        System.out.println("|                                                                                                                                                       |");
        System.out.println("|                                                                                                                                                       |");
        archived.printClass();
        System.out.println("\n\n\n");
    }

    static void showSettings(Settings<String> settingsList) {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("________________________________________________________________________________________________________________________________________________________");
        System.out.println("|                                                                                                                                                       |");
        System.out.println("|    Google Classroom                                                                                                               Settings            |");
        System.out.println("|_______________________________________________________________________________________________________________________________________________________|");
        System.out.println("|                                                                                                                                                       |");
        System.out.println("|                                                                                                                                                       |");
        System.out.println("|                                                                                                                                                       |");
        settingsList.printClass();
        System.out.println("\n\n\n");
    }

    static void openClassroom (){
        System.out.println();
        System.out.println("1. Students in the classroom");
        System.out.println("2. Classroom Activities & quizzes");
    }

    static void printMonth(int year, int month) {
        YearMonth ym = YearMonth.of(year, month);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int counter = 1;


        int dayValue = LocalDate.of(year, month, 1).getDayOfWeek().getValue();
        if (dayValue != 7)
            for (int i = 0; i < dayValue; i++, counter++) {
                System.out.printf("%-4s", "");
            }

        for (int i = 1; i <= ym.getMonth().length(ym.isLeapYear()); i++, counter++) {
            System.out.printf("%-4d", i);

            // Break the line if the value of the counter is multiple of 7
            if (counter % 7 == 0) {
                System.out.println();
            }
        }


    }


    public static void currentDateTime(){
        System.out.println();
        System.out.print("Current Date and Time: ");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }

    public static void todoMenu(){
        System.out.println("1. Assigned");
        System.out.println("2. Missing");
        System.out.println("3. Done");
        System.out.println("4. Back");
    }

    public  static void userInput(){
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.print("Activity Name: ");
        String actName = input.nextLine();


        System.out.print("Date: ");
        String date = input.nextLine();

        System.out.print("Time: ");
        String time = input.nextLine();

        CreateTask createTask = new CreateTask(actName, date, time);
        createTask.task();

    }
    public static void assignedMenu(){
        System.out.println();
        System.out.println("1. No Due Date");
        System.out.println("2. Done Early");
        System.out.println("3. This Week");
        System.out.println("4. Last Week");
        System.out.println("5. Earlier");
        System.out.println("6. Back");

    }
    public static void missing(){
        System.out.println("1. This Week");
        System.out.println("2. Last Week");
        System.out.println("3. Earlier");
        System.out.println("4. Back");

    }

    public static void doneMenu(){
        System.out.println();
        System.out.println("1. No Due Date");
        System.out.println("2. Done Early");
        System.out.println("3. This Week");
        System.out.println("4. Last Week");
        System.out.println("5. Earlier");
        System.out.println("6. Back");

    }
}