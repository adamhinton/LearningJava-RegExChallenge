package dev.lpa;

public class Main {
    public static void main(String[] args) {

        // [1] regex matching exactly "Hello, World!"
            // use matches method on string to check if input matches pattern
            // use only literal characters in regex

        String hw = "Hello, World!";

        System.out.println("[1] " + "Hello, World!".matches(hw));

        // [2]
            // regex: starting with uppercase letter, followed by zero or more lowercase letters, ending with period

        String ch2 = "[A-Z].*\\.";

        System.out.println("Abdfas.".matches(ch2));
        System.out.println("Ab.".matches(ch2));
        System.out.println("A.".matches(ch2));
        System.out.println("Abdfas".matches(ch2));
        System.out.println("bdfas".matches(ch2));
        System.out.println("bdfas".matches(ch2));
    }
}