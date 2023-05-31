public class Inheratance01 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.salary();
        e.bonous();
    }
}

class Company {
    float salary = 10555.6f;

    void salary() {

        System.out.println("Employee salary: " + salary);
    }
}

class Employee extends Company {
    int bonous = 2000;

    void bonous() {

        System.out.println("Employee bonous: " + bonous);
    }
}
