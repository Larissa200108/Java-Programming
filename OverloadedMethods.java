package exercise3;

public class OverloadedMethods {

    // First overloaded method: adds two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Second overloaded method: adds two double values
    public static double add(double a, double b) {
        return a + b;
    }

    // Third overloaded method: adds all elements of an integer array
    public static int add(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Calling the first overloaded method
        int sum1 = add(7, 5);
        System.out.println("The sum of two integers: " + sum1);

        // Calling the second overloaded method
        double sum2 = add(3.5, 9.8);
        System.out.println("The sum of two doubles: " + sum2);

        // Calling the third overloaded method
        int[] numbers = {5, 10, 15, 20, 25};
        int sum3 = add(numbers);
        System.out.println("The sum of array elements: " + sum3);
    }
}

