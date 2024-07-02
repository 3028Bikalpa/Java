
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the string that you want to check if it is palindrome or not: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String reverse="";
        for (int i = name.length()-1; i >=0; i--) {
            reverse = reverse+name.charAt(i);
        }
        System.out.println(reverse);
        if(name.equals(reverse)){
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("It is not palindrome");
        }
    }
}
