class cylinder{
    private int radius;
    private int height;
    public void setRadius(int rad){
        radius = rad;
    }

    public int getRadius(){
        return radius;
    }

    public void setHeight(int hei){
        height = hei;
    }

    public int getHeight(){
        return height;
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
public class getsetcylinder {
    public static void main(String[] args) {
        cylinder naya = new cylinder();
        naya.setRadius(7);
        naya.setHeight(10);
        System.out.println("The radius of the cylinder is: "+naya.getRadius());
        System.out.println("The height of the cylinder is: "+naya.getHeight());
        System.out.println("The surface area of this cylinder is: "+naya.getArea());
        System.out.println("The volume of this cylinder is: "+naya.getVolume());
    }
}