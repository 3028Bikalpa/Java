public class multisum {
    public static void main(String[] args) {
        int product = 0;
        for (int i = 1; i <= 10; i++) {
            product = product+(7*i);
        }
        System.out.println("The sum of the numbers in the multiplication table of 7 is "+product);
    }
}
