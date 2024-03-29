
public class OOP {
    public static void main(String args[]) {
        Pen p1 = new Pen(); // created a pen object pen
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        p1.color = "Yellow";
        System.out.println(p1.color);
        System.out.println(p1.tip);

        Student p2 = new Student();
        p2.calcPercentage(34, 54, 67);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "rushikeshpatil";
        myAcc.setPassword("12132342@@#");
        System.out.println(myAcc.username);

    }
}

class BankAccount {
    public String username;
    public String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;

    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}
