
import java.util.Scanner;

public class spacetounder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence in which you want to replace space by underscore");
        String sentence = sc.nextLine();
        String updated = sentence.replace(" ", "_");
        System.out.println("The modified sentence is "+updated);
    }
}