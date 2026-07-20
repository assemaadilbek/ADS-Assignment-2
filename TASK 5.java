public class SamsaQueue {
    public static int countStudentsUnableToEat(int[] students, int[] samsas) {
        // We don't actually need to simulate the queue moving around (which is slow). 
        // We just need to tally up how many people want each type of samsa.
        // Index 0 is circular, Index 1 is square.
        int[] preferences = new int[2];
        
        for (int student : students) {
            preferences[student]++;
        }
        
        // Look at the stack of samsas from top to bottom
        for (int samsa : samsas) {
            // If someone in line wants this samsa, they'll eventually get to the front and take it
            if (preferences[samsa] > 0) {
                preferences[samsa]--; // They took it, so one less person wants this type
            } else {
                // The top samsa isn't wanted by ANYONE left in line. The line is officially stuck.
                break;
            }
        }
        
        // Return whoever is left hungry in the array
        return preferences[0] + preferences[1];
    }

    public static void main(String[] args) {
        int[] students = {1, 1, 1, 0, 0, 1};
        int[] samsas = {1, 0, 0, 0, 1, 1};
        System.out.println("Students unable to eat: " + countStudentsUnableToEat(students, samsas));
    }
}
