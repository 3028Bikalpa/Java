class checkcircle{
    private int radius;
    private float area;
    private float circumference;
    public void setRadius(int r){
        radius = r;
    }
    public void checkArea(float a){
        area = 3.14f*radius*radius;
        if (area == a){
            System.out.println("The area is correct!");
        }
        else{
            System.out.println("!!!Warning!!! The area does not match as per the formula of area calculation");
        }
    }
    public void checkCircumference(float p){
        circumference = 2*3.14f*radius;
        if(circumference == p){
            System.out.println("The circumference is correct");
        }
        else{
            System.out.println("!!!Warning!!!The entered circumference does not match as per the formula");
        }
    }

}
public class getsetcircle {
    public static void main(String[] args) {
        checkcircle suru = new checkcircle();
        suru.setRadius(100);
        suru.checkArea(31400);
        suru.checkCircumference(628);
    }
}
