
import java.util.Scanner;

public class incometax {
    public static void main(String[] args) {
        System.out.println("Enter your income in lakhs: ");
        Scanner sc = new Scanner (System.in);
        float income = sc.nextFloat();
        float tax = 0.0f;
        if(income<=2.5f){
            tax = 0;
        }
        else if (income>2.5f&&income<=5.0f){
            tax= tax+(0.05f*(income-2.5f));
        }
        else if (income>5.0f&&income<=10.0f){
            tax = tax+(0.05f*2.5f)+(0.2f*(income-5.0f));
        }
        else if (income>10.0f){
            tax = tax+(0.05f*2.5f)+(0.2f*5.0f)+(0.3f*(income-10.0f));
        }
        else{}
        System.out.println("The amount of tax that you need top pay is "+ tax +" lakhs");
    }
}