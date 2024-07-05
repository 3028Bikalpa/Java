class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
public class oopsemployeeclass {
    public static void main(String[] args) {
        Employee bikalpa = new Employee();
        bikalpa.setName("Bikalpa");
        bikalpa.salary = 23411;
        System.out.println(bikalpa.getSalary());
        System.out.println(bikalpa.getName());
    }
}
