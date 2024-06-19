
import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        System.out.println("Enter your age to verify if you can drink or not");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a>18){
            System.out.println("You can drink");
        }
        else{
            System.out.println("You are not allowed to drink");
        }
    }
}
