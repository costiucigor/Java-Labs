package firstPackage;

import java.util.Scanner;

public class ex5 {
    public void tip5() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Circular permutations:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[(i + j) % n] + " ");
            }
            System.out.println();
        }
    }
}
