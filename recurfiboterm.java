
import java.util.Scanner;

public class recurfiboterm {
    static int fibonacci(int x){
        if (x==1){
            return 0;
        }
        else if (x==2){
            return 1;
        }
        else{
            return fibonacci(x-1)+fibonacci(x-2);
        }
    }
    public static void main(String[] args) {
        System.out.println("What term of the fibonacci series do you want to find out?");
        Scanner sc = new Scanner(System.in);
        int term = sc.nextInt();
        System.out.println("The number of the position that you entered is: "+fibonacci(term));
    }
}
