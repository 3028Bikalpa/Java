class cylinder2{
    private int radius;
    private int height;
    public cylinder2(int rad, int hei){
        radius = rad;
        height = hei;
    }

    public float getArea(){
        float Area = 2*3.14f*radius*height;
        return Area;
    }

    public float getVolume(){
        float Volume = 3.14f*radius*radius*height;
        return Volume;
    }
}
public class constrcylin {
    public static void main(String[] args) {
        cylinder2 arko = new cylinder2(10,10);
        System.out.println("The Curved surface area of the given cylinder is: "+arko.getArea());
        System.out.println("The volume of the given cylinder is: "+arko.getVolume());
    }
}
