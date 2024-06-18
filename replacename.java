
public class replacename {
    public static void main(String[] args){
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "name");
        System.out.println("The replaced one is: \n"+letter);
    }
}
