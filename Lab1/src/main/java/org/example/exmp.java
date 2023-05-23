package org.example;
import firstPackage.toLowerCase;
import firstPackage.toUpperCase;
import java.util.Scanner;
import java.util.HashMap;


public class exmp {
    public static void main(String[] args) {
        toUpperCase x = new toUpperCase(); x.tip();
        toLowerCase y = new toLowerCase(); y.convert();
        PhraseLength();
        PhraseConsonantsAndVowels();
        LongestWordInPhrase();
        ShortestWordInPhrase();
    }

    public static void PhraseLength() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a phrase: ");
        String phrase = scanner.nextLine();

        int wordCount = phrase.split("\\s+").length;

        System.out.println("Word count of the phrase: " + wordCount);
    }

    public static void PhraseConsonantsAndVowels () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a phrase: ");
        String phrase = scanner.nextLine();

        int vowelCount = 0;
        int consonantCount = 0;

        phrase = phrase.toLowerCase();

        for (int i = 0; i < phrase.length(); i++) {
            char ch = phrase.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonantCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }

    public static void LongestWordInPhrase () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a phrase: ");
        String phrase = scanner.nextLine();

        String[] words = phrase.split("\\s+");

        int maxLength = 0;
        String longestWord = "";

        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }

        System.out.println("Longest word in the phrase: " + longestWord);
    }

    public static void ShortestWordInPhrase () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a phrase: ");
        String phrase = scanner.nextLine();

        String[] words = phrase.split("\\s+");

        int minLength = Integer.MAX_VALUE;
        String shortestWord = "";

        for (String word : words) {
            if (word.length() < minLength) {
                minLength = word.length();
                shortestWord = word;
            }
        }

        System.out.println("Shortest word in the phrase: " + shortestWord);
    }
}