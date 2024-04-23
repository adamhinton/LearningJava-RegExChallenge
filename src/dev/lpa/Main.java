package dev.lpa;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // [1] regex matching exactly "Hello, World!"
            // use matches method on string to check if input matches pattern
            // use only literal characters in regex

        String hw = "Hello, World!";

        System.out.println("[1] " + "Hello, World!".matches(hw));

        // [2]
            // regex: starting with uppercase letter, followed by zero or more lowercase letters, ending with period

        String ch2 = "^[A-Z][a-z]*.*\\.$";

        for (String s : List.of(
                "The bike is red.",
                "I am a new student.",
                "hello world.",
                "How are you?"
        )){
            boolean matched = s.matches(ch2);
            System.out.println(s.matches(ch2));
        }

//        System.out.println("Abdfas.".matches(ch2));
//        System.out.println("Ab.".matches(ch2));
//        System.out.println("A.".matches(ch2));
//        System.out.println("A fsdfasa .".matches(ch2));
//        System.out.println("Abdfas".matches(ch2));
//        System.out.println("bdfas".matches(ch2));
//        System.out.println("bdfas".matches(ch2));


        System.out.println("Starting challenge 3 -------------------");


        String ch3 = "[A-Z].+[.?!]";

        for (String s : List.of(
                "The bike is red, and has flat tires.",
                "I love being a new L.P.A. student!",
                "Hello, friends and family: Welcome!",
                "How are you, Mary?"
        )){
            boolean matched = s.matches(ch3);
            System.out.println(s.matches(ch3));
        }
    }
}