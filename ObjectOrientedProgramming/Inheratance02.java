public class Inheratance02 {
    public static void main(String args[]) {
        Student a = new Student();
        a.exam();
        a.department();
        a.count();
    }
}

class University {
    void exam() {
        System.out.println("University exam: ");
    }
}

class College extends University {
    void department() {
        System.out.println(" No of Department: ");
    }
}

class Student extends College {
    void count() {
        System.out.println("No of Student: ");
    }
}
