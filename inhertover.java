class jetho{
    jetho(){
        System.out.println("This is the one with no variable");
    }
    jetho(int x){
        System.out.println("This is the one from the first ever class with the valur of x as: "+x);
    }
}

class mailo extends jetho{
    mailo(){
        System.out.println("This is the second class and with no inputs");
    }
    mailo(int x){
        System.out.println("This is the second class with only one input x as: "+x);
    }
    mailo(int x, int y){
        super(x);
        System.out.printf("This is the second class with the value of x as %d and y as %d \n", x, y);
    }
}

class kancho extends mailo{
    kancho(){
        System.out.println("This is the third class that has no inputs");
    }
    kancho(int x){
        System.out.println("This is the third class with only one input x: "+x);
    }
    kancho(int x, int y){
        super(x);
        System.out.printf("This is the third class with two inputs x: %d and y: %d", x, y);
    }
    kancho(int x, int y, int z){
        super(x, y);
        System.out.printf("This is the third class with three inputs x: %d , y: %d and z: %d", x, y, z);
    }
}
public class inhertover {
    public static void main(String[] args) {
        kancho a = new kancho(5, 6, 7);
    }
}
