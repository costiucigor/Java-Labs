package firstPackage;

import java.util.Scanner;

public class ex3 {
    public void tip3() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int firstPart = number / 1000;
        int lastPart = number % 100;
        int dialedNumber = firstPart * 100 + lastPart;
        System.out.println("The number without middle digit is: " + dialedNumber);
    }
}
