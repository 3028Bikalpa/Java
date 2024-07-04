


class Employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
    }
}

public class oopsbeg {
    
    public static void main(String[] args) {
        Employee bikalpa = new Employee();
        bikalpa.id = 3028;
        bikalpa.name = "Bikalpa";
        // System.out.println("The ID number of the employee is "+bikalpa.id);
        // System.out.println("The name of the employee is "+bikalpa.name);
        bikalpa.printDetails();
    }
}
