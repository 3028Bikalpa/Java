
import java.util.Scanner;

public class sortarray {
    public static void main(String[] args) {
        System.out.println("How many numbers do you want in the array?");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int [] numbers = new int[length];
        int counter = 0;
        boolean isSorted = true;
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < length; i++) {
            numbers [i]=sc.nextInt();
        }
        for (int i = 0; i < length-1; i++) {
            if (numbers[i]>numbers[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }
    }
}
