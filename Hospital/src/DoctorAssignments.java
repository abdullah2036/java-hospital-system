import java.util.HashMap;

public class DoctorAssignments {
    private HashMap<Integer, Doctor> doctorMap = new HashMap<>();

    public void addDoctor(Doctor doctor) {
        doctorMap.put(doctor.id, doctor);
    }

    public Doctor getDoctor(int id) {
        return doctorMap.get(id);
    }

    public void displayAllDoctors() {
        for (Doctor doc : doctorMap.values()) {
            doc.display();
        }
    }
}
