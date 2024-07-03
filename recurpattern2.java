public class recurpattern2 {
    static void pattern(int rows){
        if(rows>0){
            pattern(rows-1);
            for (int i = 0; i<rows ; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int r = 5;
        pattern(r);
    }
}
