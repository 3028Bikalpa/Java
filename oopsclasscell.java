class cellphone{
    public void call(){
        System.out.println("Calling");
    }
    public void ring(){
        System.out.println("Ringing");
    }
    public void vibrate(){
        System.out.println("Vibrating");
    }
}
public class oopsclasscell {
    public static void main(String[] args) {
        cellphone iphone = new cellphone();
        iphone.call();
        iphone.ring();
        iphone.vibrate();
    }
}
