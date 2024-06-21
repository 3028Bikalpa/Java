
import java.util.Scanner;

public class passfail {
    public static void main(String[] args) {
        System.out.println("Here we will see if the student is passed or not");
        System.out.println("Enter the marks that you got in 3 subjects");
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int total = m1+m2+m3;
        float percentage = total/3.0f;
        if(m1>=33&&m2>=33&&m3>=33&&percentage>=40){
            System.out.println("Congratulations! You have passed.");
        }
        else{
            System.out.println("Sorry, you have failed!");
        }
    }
}
