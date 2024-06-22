import java.util.Scanner;

public class webinfo {
    public static void main(String[] args){
        System.out.println("Enter the website that you want to check the type of");
        Scanner sc = new Scanner(System.in);
        String website = sc.nextLine();
        if(website.endsWith(".com")){
            System.out.println("It is a commercial website");
        }
        else if(website.endsWith(".org")){
            System.out.println("It is an organizational website");
        }
        else if(website.endsWith(".in")){
            System.out.println("It is an Indian website");
        }
        else{
            System.out.println("The website that you mentioned is not covered in this program");
        }
    }
}
