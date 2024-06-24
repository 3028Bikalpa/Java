
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number whose factorial you want to find");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int product= 1;
        for (int i = 1; i <= num; i++) {
            product = product*i;
        }
        System.out.println("The factorial of the given number is " + product);
    }
}
