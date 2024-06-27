
import java.util.Scanner;

public class checknum {
    public static void main(String[] args) {
        float [] marks = {45.0f, 22.5f, 79.6f, 99.9f, 21.0f};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mark that you want to check: ");
        float number = sc.nextFloat();
        boolean a=false;
        for (int i = 0; i < 5; i++) {
            if(marks[i]==number){
                a=true;
                break;
            }
        }
        if (a){
            System.out.println("The number is there in the list");
        }
        else{
            System.out.println("The number is not there in the list");
        }
    }
}
