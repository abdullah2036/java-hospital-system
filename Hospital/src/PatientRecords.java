public class PatientRecords {
    private class Node {
        Patient patient;
        Node next;

        Node(Patient patient) {
            this.patient = patient;
            this.next = null;
        }
    }

    private Node head;

    public void addPatient(Patient patient) {
        Node newNode = new Node(patient);
        newNode.next = head;
        head = newNode;
    }

    public void displayAll() {
        Node current = head;
        while (current != null) {
            current.patient.display();
            current = current.next;
        }
    }
}

