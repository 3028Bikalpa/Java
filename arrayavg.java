
import java.util.Scanner;

public class arrayavg {
    public static void main(String[] args) {
        System.out.println("Enter the marks 5 students got in Physics");
        int [] marks = new int[5];
        int total = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            marks [i] = sc.nextInt();
            total = total + marks[i];
        }
        float percentage = total/5;
        System.out.println("The average marks of the 5 students is "+percentage);
    }
}
