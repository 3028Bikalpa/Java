
import java.util.Scanner;

public class factorialwhile {
    public static void main(String[] args) {
        System.out.println("Enter the number whose factorial you want to find");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int product = 1;
        int i=1;
        while(i<=num){
            product = product * i;
            i++;
        }
        System.out.println("The factorial of the entered number is "+product);
    }
}
