
import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms of the fibonacci series that you want to print");
        int a = sc.nextInt();
        int b = 0;
        int c = 1;
        System.out.println(b);
        System.out.println(c);
        
        for (int i = 0; i < (a-2); i++) {
            int d = b+c;
            System.out.println(d);
            b=c;
            c=d;
        }
        
    }
}
