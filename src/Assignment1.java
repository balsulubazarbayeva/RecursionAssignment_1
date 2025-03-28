import java.util.*;

public class Assignment1 {

    // Problem 1: Find minimum in an array
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Problem 2: Find average of an array
    public static double findAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 3};

        System.out.println("Minimum: " + findMin(numbers));
        System.out.println("Average: " + findAverage(numbers));
    }
}
