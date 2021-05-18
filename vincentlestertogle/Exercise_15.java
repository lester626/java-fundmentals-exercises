import java.util.Scanner;

public class Exercise_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = scan.nextInt();

        MathClass calculator = new MathClass();
        MathClass.Calculator calc = calculator.init(num1, num2);
        MathClass.Calculator.addNumbers();
        MathClass.Calculator.subtractNumbers();
        MathClass.Calculator.multiplyNumbers();
        MathClass.Calculator.divideNumbers();
    }
}

/**
 * Create your own math calculator class.
 * 1. add
 * 2. subtract
 * 3. multiply
 * 4. divide
 * each with 2 arguments
 * use static methods.
 */