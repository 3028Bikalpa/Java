class Base1{
    Base1(){
        System.out.println("This is the parent class");
    }
}
class Derived1 extends Base1{
    Derived1(){
        System.out.println("This is the class that has been called in the main function");
    }
}
public class inheritanceconstr {
    public static void main(String[] args) {
        Derived1 a = new Derived1();
    }
}
