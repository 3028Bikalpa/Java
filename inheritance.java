class base{
    public int x;
    public void setX(int num){
        this.x = num;
    }
    public int getX(){
        return x;
    }
}

class Derived extends base{
    public int y;
    public void setY(int a){
        this.y = a;
    }
    public int getY(){
        return y;
    }
}
public class inheritance {
    public static void main(String[] args) {
        base first = new base();
        Derived arko = new Derived();
        first.setX(5);
        arko.setY(20);
        System.out.println(first.getX());
        System.out.println(arko.getY());
    }
}
