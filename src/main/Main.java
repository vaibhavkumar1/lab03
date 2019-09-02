package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Person myself=new Person("vaibhav",20,'M');
        //System.out.println(myself.toString());
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        int age = s.nextInt();
        char g = s.next().charAt(0);
        System.out.println();
        Person myself = new Person(name, age, g);
        System.out.println(myself.toString());
    }
}
