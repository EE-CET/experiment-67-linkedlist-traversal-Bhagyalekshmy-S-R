import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            list.add(scanner.nextInt());
        }
        
        ListIterator<Integer> iterator = list.listIterator();
        
        // Forward Traversal (no trailing space)
        System.out.print("Forward: ");
        while (iterator.hasNext()) {
            int value = iterator.next();
            System.out.print(value);
            if (iterator.hasNext()) {
                System.out.print(" ");
            }
        }
        
        System.out.println();
        
        // Backward Traversal (no trailing space)
        System.out.print("Backward: ");
        while (iterator.hasPrevious()) {
            int value = iterator.previous();
            System.out.print(value);
            if (iterator.hasPrevious()) {
                System.out.print(" ");
            }
        }
        
        scanner.close();
    }
}