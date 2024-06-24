public class starwhile {
    public static void main(String[] args) {
        int i = 4;
        while(i>=1){
            int j = 0;
            while(j<i){
                System.out.print("*");
                j++;
            }
            System.out.print("\n");
            i--;
        }
    }
}
