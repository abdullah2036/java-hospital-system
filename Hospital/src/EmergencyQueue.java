import java.util.PriorityQueue;

public class EmergencyQueue {
    private class EmergencyPatient implements Comparable<EmergencyPatient> {
        String name;
        int priority; // 1 = High, 2 = Mid, 3 = Low

        EmergencyPatient(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }

        public int compareTo(EmergencyPatient other) {
            return Integer.compare(this.priority, other.priority);
        }
    }

    private PriorityQueue<EmergencyPatient> queue = new PriorityQueue<>();

    public void enqueue(String name, int priority) {
        queue.offer(new EmergencyPatient(name, priority));
    }

    public void treatNext() {
        if (!queue.isEmpty()) {
            EmergencyPatient next = queue.poll();
            System.out.println("Treating: " + next.name + " [Priority: " + next.priority + "]");
        } else {
            System.out.println("No patients in queue.");
        }
    }
}
