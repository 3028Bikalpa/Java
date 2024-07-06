class rectangle{
    int length;
    int breadth;
    public int area(int a, int b){
        return (a*b);
    }
    public int perimeter(int a, int b){
        return (2*(a+b));
    }
}
public class oopsreact {
    public static void main(String[] args) {
        rectangle first = new rectangle();
        first.length=10;
        first.breadth = 5;
        System.out.println("The area is: "+first.area(first.length, first.breadth));
        System.out.println("The perimeter is: "+first.perimeter(first.length, first.breadth));
    }
}
