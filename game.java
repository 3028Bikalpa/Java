
import java.util.Random;
import java.util.Scanner;


public class game {
    public static void main(String[] args) {
        Random num = new Random();
        int a = num.nextInt(3);
        System.out.println(a);
        System.out.println("Enter a number, 0 for rock, 1 for paper and 2 for scissor");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        if (a==b){
            System.out.println("It is a draw, try again next time");
        }
        else if (a==0 && b==1) {
            System.out.println("Congratulations you won!");
        }
        else if (a==1 && b==2) {
            System.out.println("Congratulations you won!");
        }
        else if (a==2 && b==0) {
            System.out.println("Sorry, the computer won, try again nex time");
        }
        else if (a==0 && b==2) {
            System.out.println("Sorry, the computer won, try again nex time");
        }
        else if (a==1 && b==3) {
            System.out.println("Sorry, the computer won, try again nex time");
        }
        else if (a==2 && b==1) {
            System.out.println("Sorry, the computer won, try again nex time");
        }
    }
}
