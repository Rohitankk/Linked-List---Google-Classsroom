import MyListInterface.ListOverflowException;
import MyListInterface.SinglyLink;

public class Classroom   {
    private String classroomName;
    private SinglyLink<String> people = new SinglyLink<>();
    private SinglyLink<String> stream = new SinglyLink<>();
    private SinglyLink<String> classwork = new SinglyLink<>();
    private SinglyLink<String> date = new SinglyLink<>();

    public Classroom() throws ListOverflowException {
        people.insert("Maria Garcia");
        people.insert("George Taylor");
        people.insert("William Clark");
        people.insert("Henry Davis");
        people.insert("Wilson Miller");
        people.insert("Kobe Bryant");
        people.insert("Michael Jordan");


        classwork.insert("Activity 1");
        date.insert("22-April-2022");

        classwork.insert("Activity 2");
        date.insert("23-April-2022");

        classwork.insert("Activity 3");
        date.insert("30-April-2022");

        classwork.insert("Quiz 1");
        date.insert("2-May-2022");

        classwork.insert("Quiz 2");
        date.insert("5-May-2022");
        stream.insert("The activities and quizzes are already posted.");
    }

    public SinglyLink<String> getPeople (){
        return people;
    }
    public SinglyLink<String> getStream(){
        return stream;
    }
    public SinglyLink<String> getClasswork() {
        return classwork;
    }
    public String getClassroomName() {
        return classroomName;
    }
    public SinglyLink<String> getDueDate() {
        return date;
    }

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName;
    }

    public void setClasswork(SinglyLink<String> classwork) {
        this.classwork = classwork;
    }

    public void setPeople(SinglyLink<String> people) {
        this.people = people;
    }

    public void setStream(SinglyLink<String> stream) {
        this.stream = stream;
    }

    public void setDueDate(SinglyLink<String> date) {
        this.date = date;
    }
}
