package firstPackage;

import java.util.Scanner;

public class ex2 {
    public void tip2() {
        System.out.println("Insert numbers (zero required):");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int number;
        do {
            number = scanner.nextInt();
            if (number != 0) {
                sum += number;
                count++;
            }
        } while (number != 0);
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("The average is: " + average);
        } else {
            System.out.println("No numbers were entered.");
        }
    }
}

