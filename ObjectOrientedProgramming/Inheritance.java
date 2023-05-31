
public class Inheritance {
    public static void main(String args[]) {
        Fish shark = new Fish();
        shark.swim();

    }

}

// Base class
class Animal {
    String color;

    // void eat() {
    // System.out.println("eats");
    // }

    void breathe() {
        System.out.println("breathes");
    }
}

// Derived Class
class Bear extends Animal {
    void eat() {
        System.out.println("eats Fishes");
    }
}

class Fish extends Bear {
    int fins;

    void swim() {
        System.out.println("Swin in water");
    }
}