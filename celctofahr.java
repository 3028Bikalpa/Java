
import java.util.Scanner;

public class celctofahr {
    static void fahr(){
        System.out.println("Enter the celcius temperature that you want to change to fahrenheit");
        Scanner sc = new Scanner(System.in);
        float celcius = sc.nextFloat();
        float fahr = ((celcius*18)/10)+32;
        System.out.println("The temperature in fahrenheit is "+fahr);
    }
    public static void main(String[] args) {
        fahr();
    }
}
