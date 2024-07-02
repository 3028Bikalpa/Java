
import java.util.Scanner;

public class fibonaccirecur {
    static int fibonacci(int x){
        if (x==1){
            return array[0];
        }
        else if(x==2){
            return array[1];
        }
        else{
            array[n-1]= fibonacci(x-1)+fibonacci(x-2);
            return array[n-1];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms of the fibonacci series that you want to print");
        int a = sc.nextInt();
        array[0]=0;
        array[1]=1;
        System.out.printf("%d, ", fibonacci(a));
    }
}
