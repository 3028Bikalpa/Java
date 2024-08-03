class Phone{
    public void ShowTime(){
        System.out.println("This function will display time");
    }
    public void on(){
        System.out.println("This function is to turn the phone on");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("This function will play the music");
    }
    public void on(){
        System.out.println("This function is to turn on the SmartPhone");
    }
}
public class dymethdisp {
    public static void main(String[] args) {
        Phone oppo = new SmartPhone();
        oppo.ShowTime();
        oppo.on();
        // here we cannot use oppo.music but cannot use the other ones
    }
}
