package firstPackage;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex4 {
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    public void tip4() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(scanner.nextInt());
        }
        int numerator = 0;
        int denominator = 1;
        for (int a : set) {
            for (int b : set) {
                if (a > b && gcd(a, b) == 1) {
                    if (a / b > numerator / denominator) {
                        numerator = a;
                        denominator = b;
                    }
                }
            }
        }
        System.out.println("Cel mai mare numar rational este: " + numerator + "/" + denominator);
    }
}

