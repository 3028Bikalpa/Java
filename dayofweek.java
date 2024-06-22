import java.util.Scanner;

public class dayofweek {
    public static void main(String[] args) {
        System.out.println("Enter the position of the day of the week you want to find");
        Scanner sc = new Scanner (System.in);
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("It is Monday");
                break;
            case 2:
                System.out.println("It is Tuesday");
                break;
            case 3:
                System.out.println("It is Wednesday");
                break;
            case 4:
                System.out.println("It is Thursday");
                break;
            case 5:
                System.out.println("It is Friday");
                break;
            case 6:
                System.out.println("It is Saturday");
                break;
            case 7:
                System.out.println("It is Sunday");
                break;
            default:
                System.out.println("Invalid entry");
        }    
    }
}
