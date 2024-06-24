public class breakcontinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 2){
                break;
            }
            System.out.println(i);
        }
        for (int j = 0; j < 10; j++) {
            if (j==2){
                continue;
            }
            System.out.println(j);
        }
    }
}
