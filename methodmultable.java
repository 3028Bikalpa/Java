
import java.util.Scanner;

public class methodmultable {
    static void table(int x){
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d * %d = %d\n", x, i, x*i);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number whose multiplication table you want to find");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        table(a);
    }
}
