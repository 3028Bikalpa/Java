import java.util.Scanner;

public class spacedetect {   
    public static void main(String[] args) {
        System.out.println("Enter the sentence in which you want to check the number of spaces");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println(sentence.indexOf("  "));
        System.out.println(sentence.indexOf("   "));
    }
}
