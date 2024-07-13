class checksuper{
    int a;
    public int getValue(){
        return a;
    }
    checksuper(int a){
        this.a = a;
    }

}
class arkocheck extends checksuper{
    arkocheck(int c){
        super(c);
    }
}
public class classsuper {
    public static void main(String[] args) {
        checksuper naya = new checksuper(5);
        arkocheck arkai = new arkocheck(1);
        System.out.println("The value of a is: "+naya.getValue());
    }
}
