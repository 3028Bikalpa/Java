
import java.util.Scanner;

public class lowercase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string that you want to take to lowercase");
        String name = sc.nextLine();
        String lowercase = name.toLowerCase();
        System.out.println("The lowercase format of the given string "+name+" is "+lowercase);
    }
}