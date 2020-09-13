import java.util.Scanner;

public class MyMain {
    
    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        double n = 1;
        double m = 1;
        do {
            n = m;
            n = (Math.random() * x);
            m = (n + x/n)/2;
        }
        while (Math.abs(n - m) > 0.00001);
        return m;
    }

    // Calculates the factorial of a number
    public static double factorial(int x) {
        int total = 1;
        for (int i = x; i > 1; i--){
            total *= i;
        }
        return total;
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        double e = 0;
        int x = 0;
        while (Math.abs(Math.E - e) > 0.00001){
            e += 1/factorial(x);
            x += 1;
        }
        return e;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        double x = scan.nextDouble();
        System.out.println("The square root of " + x + " is " + babylonian(x));
        System.out.println("The values of e is roughly " + calculateE());
        scan.close();
    }
}
