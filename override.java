class A{
    public void met1(){
        System.out.println("This is method 1 from the class A");
    }
}
class B extends A{
    // @Override Not necesary to write it, but better to write it
    public void met1(){
        System.out.println("This is method 1 from the class B");
    }
}
public class override {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.met1();
        B obj2 = new B();
        obj2.met1();
    }
}
