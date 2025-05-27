package main.java;
import main.kotlin.ExtensionsKt;
import main.kotlin.KotlinDemoKt;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Extension Functions Demo ===\n");

        demonstrateStringExtensions();
        demonstrateListExtensions();
        demonstrateNumberExtensions();

        System.out.println();
        KotlinDemoKt.demonstrateJavaInterop();
    }

    private static void demonstrateStringExtensions() {
        System.out.println("=== String Extensions ===");

        String text = "hello world";


        System.out.println("Text: '" + text + "'");
        System.out.println("Capitalized: " + ExtensionsKt.capitalize(text));
        System.out.println("No spaces: " + ExtensionsKt.removeSpaces(text));


        String email = "test@email.com";
        String badEmail = "not-an-email";
        System.out.println("\nEmail validation:");
        System.out.println(email + " is valid: " + ExtensionsKt.isValidEmail(email));
        System.out.println(badEmail + " is valid: " + ExtensionsKt.isValidEmail(badEmail));
    }

    private static void demonstrateListExtensions() {
        System.out.println("\n=== List Extensions ===");

        List<String> fruits = Arrays.asList("apple", "banana", "cherry");
        List<String> shortList = Arrays.asList("only-one");

        System.out.println("Fruits: " + fruits);
        System.out.println("Second fruit: " + ExtensionsKt.secondOrNull(fruits));
        System.out.println("Joined: " + ExtensionsKt.joinWithComma(fruits));

        System.out.println("\nShort list: " + shortList);
        System.out.println("Second item: " + ExtensionsKt.secondOrNull(shortList));
    }

    private static void demonstrateNumberExtensions() {
        System.out.println("\n=== Number Extensions ===");

        int[] numbers = {4, 7, 10};

        for (int num : numbers) {
            System.out.println("Number " + num +
                    " - Even: " + ExtensionsKt.isEven(num) +
                    ", Squared: " + ExtensionsKt.square(num));
        }
    }
}