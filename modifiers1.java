

class Myemployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
}
public class modifiers1 {
    public static void main(String[] args) {
        Myemployee Bikalpa = new Myemployee();
        Bikalpa.setName ("Bikalpa");
        Bikalpa.setId (3028);
        System.out.println("The name of the employee is: "+Bikalpa.getName());
        System.out.println("The Id number of the employee is: "+Bikalpa.getId());
    }
}
