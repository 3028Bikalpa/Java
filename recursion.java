public class recursion {
    static int factorial(int x){
        if (x==0||x==1){
            return 1;
        }
        else{
            return x*factorial(x-1);
        }
    }
    public static void main(String[] args) {
        int a = 5;
        System.out.println("The factorial of the given number is "+ factorial(a));
    }
}
