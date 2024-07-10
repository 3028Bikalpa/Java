class animal{
    public String voice;
    public void setSound(String sound){
        voice = sound;
    }
    public String getSound(){
        return voice;
    }
}
class Dog{
    public String help;
    public void setHelp(String work){
        help = work;
    }
    public String getHelp(){
        return help;
    }
}
public class inheritancequiz {
    public static void main(String[] args) {
        animal dog = new animal();
        Dog arko = new Dog();
        dog.setSound("bark");
        arko.setHelp ("guard");
        System.out.println("The sound made by this animal is: "+dog.getSound());
        System.out.println("The help done by this animal is: "+arko.getHelp());
    }
}
