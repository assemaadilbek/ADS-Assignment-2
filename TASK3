import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class KarimShelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        // A Deque is perfect for this because Karim interacts with both the 
        // left and right sides of the shelf. Standard queues or stacks wouldn't cut it.
        Deque<Integer> shelf = new LinkedList<>();
        
        for (int i = 0; i < n; i++) {
            int operation = sc.nextInt();
            
            if (operation == 1) {
                // Karim puts a DVD on the left edge
                shelf.addFirst(sc.nextInt());
            } else if (operation == 2) {
                // Karim puts a DVD on the right edge
                shelf.addLast(sc.nextInt());
            } else if (operation == 3) {
                // Karim takes a DVD from the left, let's print which one it was
                System.out.println(shelf.removeFirst());
            } else if (operation == 4) {
                // Karim takes a DVD from the right
                System.out.println(shelf.removeLast());
            }
        }
        sc.close();
    }
}
