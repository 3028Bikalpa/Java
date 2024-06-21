
import java.util.Scanner;

public class switchcase {
    public static void main (String[] args){
        int age;
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch (age) {
            case 18:
                System.out.println("You are going to be an adult");
                break;
            case 25:
                System.out.println("You are going to work");
                break;
            case 61:
                System.out.println("You are going to retire");
                break;
            default:
                System.out.println("Have fun");;
        }
    }
}
