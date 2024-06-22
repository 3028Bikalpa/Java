
import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
      System.out.println("Enter the year you want to check is a leap year or not");
      Scanner sc = new Scanner(System.in);
      int year = sc.nextInt();
      if (year%4==0){
        if (year%100==0){
            if (year%400==0){
                System.out.println("The year is leap year");
            }
            else{
                System.out.println("The year is not a leap year");
            }
        }
      } 
      else{
        System.out.println("The year is not a leap year");
      }
    }}
