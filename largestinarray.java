
import java.util.Scanner;

public class largestinarray {
    public static void main(String[] args) {
        System.out.println("How many entries do you want to enter in the array?");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int [] numbers = new int[length];
        System.out.println("Enter the numbers of the array: ");
        for (int i = 0; i < length; i++) {
            numbers[i]=sc.nextInt();
        }
        int largest=0;
        for (int i = 0; i < length; i++) {
            largest=largest>numbers[i]?largest:numbers[i];
        }
        System.out.println("The largest number in the given list of the numbers is "+largest);
    }
}
