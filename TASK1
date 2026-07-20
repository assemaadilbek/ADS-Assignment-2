import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Grab the number of lines we need to process
        int n = sc.nextInt();
        
        // We'll use a list of lists to represent the rows of numbers
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();
        
        // Read each line and populate our main list
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            ArrayList<Integer> currentLine = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                currentLine.add(sc.nextInt());
            }
            lines.add(currentLine);
        }
        
        // Time to process the queries
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            // The problem uses 1-based indexing (like 1st line, 1st position), 
            // but Java uses 0-based. So, we subtract 1 from x and y.
            // We also need to check the bounds so our program doesn't crash on bad queries!
            if (x <= lines.size() && y <= lines.get(x - 1).size()) {
                System.out.println(lines.get(x - 1).get(y - 1));
            } else {
                System.out.println("ERROR!");
            }
        }
        sc.close();
    }
}
