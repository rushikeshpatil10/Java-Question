public class Hierichial_Inheritance {
    public static void main(String args[]) {
        Bird s1 = new Bird();
        s1.eats();
        s1.fly();
    }
}

class Animal {
    String color;

    void eats() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Mammal extends Animal {
    int legs;

}

class Fish extends Animal {
    void swim() {
        System.out.println("Swim");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("fly");
    }
}