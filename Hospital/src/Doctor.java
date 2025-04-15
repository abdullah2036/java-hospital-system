public class Doctor {
    int id;
    String name;
    String department;
    String schedule;

    public Doctor(int id, String name, String department, String schedule) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.schedule = schedule;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Dept: " + department + ", Schedule: " + schedule);
    }
}
