class arkoemployee{
    private int id;
    private String name;
    private int salary;

    public arkoemployee(){
        id = 0;
        name = "Not Entered";
        salary = 0;
    }

    public arkoemployee(int num){
        id = num;
        name = "Not Entered";
        salary = 0;
    }

    public arkoemployee(int num, String person){
        id = num;
        name = person;
        salary = 100000;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }
}
public class constructors {
    public static void main(String[] args) {
        arkoemployee koimanxe = new arkoemployee(28, "Bikalpa");
        System.out.println(koimanxe.getId());
        System.out.println(koimanxe.getName());
        System.out.println(koimanxe.getSalary());
    }
}
