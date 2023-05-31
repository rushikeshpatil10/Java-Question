// Java program to demonstrate the 
// working of ArrayList in Java 

import java.io.*;
import java.util.*;
import java.util.ArrayList;

class Classroom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> classes = new ArrayList<>();
        ArrayList<Boolean> booleanList = new ArrayList<>();

        list.add(1); // o(1)
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        list.add(1, 9); // o(n)
        System.out.println(list);

        // // get element o(1)
        // int element = list.get(2);
        // System.out.println(element);

        // // remove element; o(N)
        // list.remove(2);
        // System.out.println(list);

        // set O(N)
        // list.set(2, 10);
        // System.out.println(list);

        // // cointain element O(N)
        // System.out.println(list.contains(10));
        // System.out.println(list.contains(3));
    }
}
