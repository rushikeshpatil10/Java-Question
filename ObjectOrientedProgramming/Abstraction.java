public class Abstraction {
    public static void main(String args[]) {
        // Horse h = new Horse();
        Mustang myhorse = new Mustang();
        // Animal --> Horse--> Mustang

        // h.eat();
        // h.walk();
        // // h.Changecolor();
        // System.out.println(h.color);

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();
    }
}

abstract class Animal {
    String color;

    Animal() {
        System.out.println("animal constructor called");
    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("horse connstructor is called");
    }

    void Changecolor() {
        color = "dark Brown";
    }

    void walk() {
        System.out.println("walks on 4 legs");
    }

}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor is called");
    }
}

class Chicken extends Animal {
    void changecolor() {
        color = "dark red";
    }

    void walk() {
        System.out.println("walks on 2 legs");
    }
}
