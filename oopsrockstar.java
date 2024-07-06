public class oopsrockstar {
    public static void main(String[] args) {
        TommyVecetti demo = new TommyVecetti();
        demo.fire();
        demo.run();
        demo.hit();
    }
}

class TommyVecetti{
    public void hit(){
        System.out.println("Hitting");
    }
    public void run(){
        System.out.println("Running");
    }
    public void fire(){
        System.out.println("Firing");
    }
}
// public class oopsclasscell {
//     public static void main(String[] args) {
//         cellphone iphone = new cellphone();
//         iphone.call();
//         iphone.ring();
//         iphone.vibrate();
//     }
// }