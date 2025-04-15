import java.util.Stack;

public class TreatmentHistory {
    private Stack<String> treatments = new Stack<>();

    public void addTreatment(String treatment) {
        treatments.push(treatment);
    }

    public String getLastTreatment() {
        return treatments.isEmpty() ? "No treatment history." : treatments.peek();
    }

    public void displayHistory() {
        if (treatments.isEmpty()) {
            System.out.println("No treatment history.");
        } else {
            System.out.println("Treatment History:");
            for (String treatment : treatments) {
                System.out.println("- " + treatment);
            }
        }
    }
}
