
import java.util.Scanner;

public class methodsumnatural {
    static int sum(int x){
        int answer = x;
        if (x==1){
            return 1;
        }
        else{
            answer = answer + sum(x-1);
            return answer;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the natural numbers whose sum you want to find");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("The sum of the natural numbers that you entered is: "+sum(a));
    }
}
