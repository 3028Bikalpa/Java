
import java.util.Scanner;

public class arraylooprint {
    public static void main(String[] args) {
        int [] number = new int[5];
        System.out.println("Enter the numbers that you want to test");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            number [i] = sc.nextInt();
        }
        System.out.println("The numbers you entered are:");
        for (int j = 0; j < 5; j++) {
            System.out.println(number[j]);
        }
    }
}
