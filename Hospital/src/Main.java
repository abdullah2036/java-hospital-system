public class Main {
    public static void main(String[] args) {
        // Patient Records
        PatientRecords pr = new PatientRecords();
        Patient p1 = new Patient(101, "Ahmed", 25, "45466464664");
        Patient p2 = new Patient(102, "Ali", 40, "4564646400");
        pr.addPatient(p1);
        pr.addPatient(p2);
        pr.displayAll();

        // Emergency Queue
        EmergencyQueue eq = new EmergencyQueue();
        eq.enqueue("Ahmed", 3); // Low
        eq.enqueue("Ali", 1);   // High
        eq.treatNext(); // Should treat Ali

        // Treatment History
        p1.history.addTreatment("Surgery on 2025-02-01");
        p1.history.addTreatment("Antibiotics");
        p1.history.displayHistory();
        System.out.println("Last Treatment: " + p1.history.getLastTreatment());

        // Doctor Assignments
        DoctorAssignments da = new DoctorAssignments();
        da.addDoctor(new Doctor(201, "Dr. Khalid", "Cardiology", "9AM-5PM"));
        da.addDoctor(new Doctor(202, "Dr. Sara", "Neurology", "10AM-6PM"));
        da.displayAllDoctors();
    }
}
