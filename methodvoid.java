
import java.util.Scanner;

public class methodvoid {
    static void noreturn(int x, int y){
        int z = x+y;
        System.out.println("The sum of the numbers is "+z);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 numbers whose sum you want: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        noreturn(a, b);
    }
}
