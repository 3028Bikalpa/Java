public class arraylooprev {
    public static void main(String[] args) {
        int [] marks = {98, 34, 53, 23, 56};
        System.out.println("The marks you got are: ");
        for (int i = (marks.length-1); i >=0; i--) {
            System.out.println(marks[i]);
        }
    }
}
