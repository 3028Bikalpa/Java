public class recurpattern {
    static void pattern(int j){
        if(j>0){
            for (int i = j; i >0; i--) {
                System.out.print("*");
            }
            System.out.println("");
            pattern (j-1);
        }
        
    }
    public static void main(String[] args) {
        int r = 5;
        pattern(r);
    }
}
