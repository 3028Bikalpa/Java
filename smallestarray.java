
import java.util.Scanner;

public class smallestarray {
    public static void main(String[] args) {
        System.out.println("How many numbers do you want to enter in the array?");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int [] numbers = new int [length];
        System.out.println("Enter the numbers that you want to include in the array: ");
        int smallest = 2147483647;
        for (int i = 0; i < length; i++) {
            numbers [i] = sc.nextInt();
            smallest = smallest<numbers[i]?smallest:numbers[i];
        }
        System.out.println("The smallest number among the numbers that you entered is: "+smallest);
    }
}
