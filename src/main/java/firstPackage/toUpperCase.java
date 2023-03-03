package firstPackage;

import java.util.Scanner;

public class toUpperCase {
    public static void tip() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a phrase: ");
        String phrase = scanner.nextLine();

        String uppercasePhrase = phrase.toUpperCase();

        System.out.println("Uppercase phrase: " + uppercasePhrase);
    }
}
