
import java.util.Scanner;

public class arraysum {
    public static void main(String[] args) {
        float [] numbers = new float[5];
        Scanner sc = new Scanner(System.in);
        float sum = 0;
        System.out.println("Enter the decimal numbers whose sum you want to find out");
        for (int i = 0; i < 5; i++) {
            numbers [i] = sc.nextFloat();
            sum = sum + numbers [i];
        }
        System.out.println("The sum of the given float numbers is "+sum);
    }
}
