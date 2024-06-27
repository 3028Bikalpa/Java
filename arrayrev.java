
import java.util.Scanner;

public class arrayrev {
    public static void main(String[] args) {
        System.out.println("How many numbers do you want to enter in the array?");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int [] numbers = new int[length];
        int [] copy = new int[length];
        System.out.println("Enter the numbers that you want to enter in the array");
        for (int i = 0; i < length; i++) {
            numbers [i] = sc.nextInt();
        }
        System.out.println("The numbers that you entered in the array are: ");
        for (int i = 0; i < length; i++) {
            System.out.println(numbers[i]);
        }
        int a = 0;
        for (int i = 0; i < length; i++) {
            copy[i] = numbers[i];
        }
        for (int i = 0; i < length; i++) {
            numbers[i]=copy[numbers.length-i-1];
        }
        System.out.println("The reversed array is given below: ");
        for (int i = 0; i < length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
