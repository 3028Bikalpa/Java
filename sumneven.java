import java.util.Scanner;

public class sumneven {
    public static void main(String[] args) {
        System.out.println("How many even number's sum do you want to print?");
        Scanner sc = new Scanner(System.in);
        int numbers = sc.nextInt();
        int sum =0;
        while (numbers>=1){
            sum = sum + (2*numbers);
            numbers--;
        }
        System.out.println("The required sum is "+sum);
}}
