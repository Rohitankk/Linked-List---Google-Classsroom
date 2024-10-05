public  class CreateTask {
    String activityName, date, time;

    public CreateTask(String activityName, String date, String time){
        this.activityName = activityName;
        this.date = date;
        this.time = time;
    }

     void task(){
        System.out.println();
        System.out.println("\t\tReminder");
        System.out.println("Activity name: " + activityName);
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
    }
}
