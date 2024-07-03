
import java.util.Scanner;

public class argsavg {
    static float average(float ...arr){
        float total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        float answer = total/arr.length;
        return answer;
    }
    public static void main(String[] args) {
        System.out.println("How many numbers do you want to enter?");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        System.out.println("Enter the numbers whose average you want to find out: ");
        float [] arr = new float[length];
        for (int i = 0; i < length; i++) {
            arr[i]=sc.nextFloat();
        }
        System.out.println("The average of the given numbers is: "+average(arr));
    }
}
