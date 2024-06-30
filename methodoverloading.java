public class methodoverloading {
    static void sample(){
        System.out.println("Hi!");
    }
    static void sample(int a ){
        System.out.println(a);
    }
    public static void main(String[] args) {
        int x = 5;
        sample();
        sample(x);
    }
}
