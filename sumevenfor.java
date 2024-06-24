
import java.util.Scanner;

public class sumevenfor {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("How many even number's sum do you need");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sum = sum + (2*i);
        }
        System.out.println("The sum of that number of even numbers is: "+sum);
    }
}
