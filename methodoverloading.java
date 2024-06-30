public class methodoverloading {
    static void sample(){
        System.out.println("Hi!");
    }
    static void sample(int b ){
        System.out.println(b);
    }
    static int square(int a){
        int y = a*a;
        return y;
    }
    public static void main(String[] args) {
        int x = 5;
        sample();
        sample(x);
        int ans = square(x);
        System.out.println("The square of the number is: "+ ans);
    }
}
