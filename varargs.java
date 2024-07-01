public class varargs {
    static int sum(int ...arr){
        int result = 0;
        for (int a : arr) {
            result +=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The sum of 2 and 3 is "+ sum(2, 3));
        System.out.println("The sum of 2, 4 and 3 is "+ sum(2, 4, 3));
        System.out.println("The sum of 2, 4, 5 and 3 is "+ sum(2, 4, 5, 3));
    }
}
