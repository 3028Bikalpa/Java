
import java.util.Scanner;

class square{
    int length;
    public int perimeter(int l){
        return (4*l);
    }
    public int area(int a){
        return (a*a);
    }
}
public class oopsquare {
    public static void main(String[] args) {
        square first = new square();
        System.out.println("Enter the length of the square");
        Scanner sc = new Scanner(System.in);
        first.length = sc.nextInt();
        System.out.println("The perimeter of the square is: "+first.perimeter(first.length));
        System.out.println("The area of the square is: "+first.area(first.length));
    }
}
