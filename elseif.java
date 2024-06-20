
import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age<13){
            System.out.println("You are a kid");
        }
        else if (age>13 && age<20) {
            System.out.println("You are a teenager");
        }
        else{
            System.out.println("You are an adult");
        }
    }
}
