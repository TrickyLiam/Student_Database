package org.example;
import java.util.Locale;
import java.util.Scanner;

public class DatabaseMain {
    public static void main(String[] args) {
        System.out.println("\nHi! Welcome to the student help center.\n");
        Scanner scanner = new Scanner(System.in);
        String [] userInput = userInput("Please enter your name and grade level (Freshman, Sophomore, Junior, or Senior): ", scanner);
        String userName = userInput[0].substring(0, 1).toUpperCase() + userInput[0].substring(1);
        System.out.println("Welcome, " + userName);
    }


    public static String[] userInput(String prompt, Scanner scanner) {
        String[] questions = new String[2];
        for (int i = 0; i < questions.length; i++) {
            if (i == 0) {
                System.out.println(prompt);;
                System.out.println("Name: ");
            } else {
                System.out.println("Grade level: ");
            }
            questions[i] = scanner.nextLine();
        }
        return questions;
    }

//    public static boolean isValid (String userInput) {
//    }

}