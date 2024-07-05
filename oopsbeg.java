


class Employee1{
    int id;
    String name;
    public void printDetails(){
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
    }
}

public class oopsbeg {
    
    public static void main(String[] args) {
        Employee1 bikalpa = new Employee1();
        Employee1 John = new Employee1();
        bikalpa.id = 3028;
        bikalpa.name = "Bikalpa";
        John.id = 3000;
        John.name = "John";
        // System.out.println("The ID number of the employee is "+bikalpa.id);
        // System.out.println("The name of the employee is "+bikalpa.name);
        bikalpa.printDetails();
        John.printDetails();
    }
}
