public class RecursionAssignment {

    public static int findMin(int[] arr, int index) {
        if (index == arr.length - 1) return arr[index];
        return Math.min(arr[index], findMin(arr, index + 1));
    }

    public static double average(int[] arr, int index, int sum) {
        if (index == arr.length) return (double) sum / arr.length;
        return average(arr, index + 1, sum + arr[index]);
    }

    public static boolean isPrime(int n, int i) {
        if (n < 2) return false;
        if (i * i > n) return true;
        if (n % i == 0) return false;
        return isPrime(n, i + 1);
    }

    public static int sumArray(int[] arr, int index) {
        if (index == arr.length) return 0;
        return arr[index] + sumArray(arr, index + 1);
    }

    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int power(int base, int exp) {
        if (exp == 0) return 1;
        return base * power(base, exp - 1);
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static String toBinary(int n) {
        if (n == 0) return "0";
        if (n == 1) return "1";
        return toBinary(n / 2) + (n % 2);
    }

    public static String reverseString(String str) {
        if (str.isEmpty()) return "";
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 7};
        System.out.println("1. Minimum: " + findMin(arr, 0));
        System.out.println("2. Average: " + average(arr, 0, 0));
        System.out.println("3. Is 7 prime? " + isPrime(7, 2));
        System.out.println("4. Sum of array: " + sumArray(arr, 0));
        System.out.println("5. Factorial of 5: " + factorial(5));
        System.out.println("6. Fibonacci(7): " + fibonacci(7));
        System.out.println("7. 2^5: " + power(2, 5));
        System.out.println("8. GCD of 48 and 18: " + gcd(48, 18));
        System.out.println("9. Binary of 10: " + toBinary(10));
        System.out.println("10. Reversed string: " + reverseString("recursion"));
    }
}
