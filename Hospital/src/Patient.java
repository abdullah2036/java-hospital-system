public class Patient {
    int id;
    String name;
    int age;
    String contact;
    TreatmentHistory history;

    public Patient(int id, String name, int age, String contact) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.history = new TreatmentHistory();
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Contact: " + contact);
    }
}
