
import java.util.Scanner;

public class multiplicationtable {
    public static void main(String[] args) {
        System.out.println("Enter the number whose multiplication table you want to print");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", n, i, n*i);
        }
    }
}
