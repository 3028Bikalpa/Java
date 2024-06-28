
import java.util.Scanner;

public class methodssample1 {
    static int check (int x, int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        System.out.println("Enter the numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c=check(a, b);
        System.out.println("The result is "+c);
    }
}
