package firstPackage;
public class ex1 {
    public void tip() {
        int[] numbers = {2, 2, 3, 4, 5, 32, 312, 321, 321, 32, 1};
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Minimum value in array: " + min);
    }
}