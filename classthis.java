class sample{
    int a;
    public int getA(){
        return a;
    }
    sample(int a){
        this.a = a;
    }
    public int returnOne(){
        return 1;
    }
}
public class classthis {
    public static void main(String[] args) {
        sample kunai = new sample(5);
        System.out.println("The value of a is: "+ kunai.getA());
    }
}
