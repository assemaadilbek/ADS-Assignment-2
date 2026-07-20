import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListModifications {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Let's set up the initial list with the starting numbers
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        
        // Now handle the queries one by one
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            String operation = sc.next();
            if (operation.equals("Insert")) {
                int index = sc.nextInt();
                int value = sc.nextInt();
                list.add(index, value);
            } else if (operation.equals("Delete")) {
                int index = sc.nextInt();
                list.remove(index);
            }
        }
        
        // Finally, print everything out with a space in between
        for (int num : list) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
