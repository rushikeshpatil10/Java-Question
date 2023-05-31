
public class Constructor {
    public static void main(String args[]) {

        // Student s2 = new Student("Rushi");
        // Student s3 = new Student(23);
        // System.out.println(s2.name);
        // System.out.println(s3.roll);
        Student s1 = new Student();
        s1.name = "Rushi";
        s1.roll = 234;
        s1.password = "xyz";
        s1.marks[0] = 100;
        s1.marks[1] = 98;
        s1.marks[2] = 90;

        Student s2 = new Student(s1);
        s2.password = "Xyz";
        s1.marks[2] = 100;

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // Student(String name) {
    // this.name = name;
    // }

    // shallow copy constructor
    // Student(Student s1) {
    // marks = new int[3];
    // this.name = s1.name;
    // this.roll = s1.roll;
    // this.marks = s1.marks;

    // }

    // deep copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student() { // non Parameterised constructor
        marks = new int[3];
        System.out.println("Constructor is called");

    }

    // Parameterised constructor
    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}