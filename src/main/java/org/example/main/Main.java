package org.example.main;

public class Main {
    public static void main(String[] args) {
        System.out.println("Meow and....");
        new Main().message();
        new Main().print("works");
    }

    public void message() {
        System.out.println("no");
    }

    public void print(String msg) {
        System.out.println("Test");
    }
}
