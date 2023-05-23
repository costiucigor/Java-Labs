package firstPackage;
import java.util.Scanner;

public class toLowerCase {
    public static void convert() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a phrase: ");
        String phrase = scanner.nextLine();

        String lowerCasePhrase = phrase.toLowerCase();

        System.out.println("Lowercase phrase: " + lowerCasePhrase);
    }
}
