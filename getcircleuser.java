
import java.util.Scanner;

class checker{
    private int radius;
    private float area;
    private float circumference;
    public void setRadius(int r){
        radius = r;
    }
    public void checkArea(float a){
        area = 3.14f*radius*radius;
        if(area == a){
            System.out.println("The area entered is correct");
        }
        else{
            System.out.println("!!!Warning!!! The area entered is not correct");
        }
    }
    public void checkCircumference(float c){
        circumference = 2*3.14f*radius;
        if(circumference == c){
            System.out.println("The circumference entered is correct");
        }
        else{
            System.out.println("!!!Warning!!! The entered circumference is incorrect");
        }
    }

}

public class getcircleuser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        int diner = sc.nextInt();
        System.out.println("Enter the area that you want to check");
        float dinearea = sc.nextFloat();
        System.out.println("Enter the circumference of the circle");
        float dinecirc = sc.nextFloat();
        checker pahilo = new checker();
        pahilo.setRadius(diner);
        pahilo.checkArea(dinearea);
        pahilo.checkCircumference(dinecirc);
    }
}
