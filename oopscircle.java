import java.util.Scanner;

public class oopscircle {
    public static void main(String[] args) {
        circle first = new circle();
        System.out.println("Enter the length of the square");
        Scanner sc = new Scanner(System.in);
        first.radius = sc.nextInt();
        System.out.println("The perimeter of the square is: "+first.perimeter(first.radius));
        System.out.println("The area of the square is: "+first.area(first.radius));
    }
}


class circle{
    int radius;
    public float perimeter(int l){
        float ans= 2*3.14f*l;
        return ans;
    }
    public float area(int a){
        float ans = a*3.14f*a;
        return ans;
    }
}
// public class oopsquare {
//     public static void main(String[] args) {
//         square first = new square();
//         System.out.println("Enter the length of the square");
//         Scanner sc = new Scanner(System.in);
//         first.length = sc.nextInt();
//         System.out.println("The perimeter of the square is: "+first.perimeter(first.length));
//         System.out.println("The area of the square is: "+first.area(first.length));
//     }
// }