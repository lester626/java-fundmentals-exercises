import java.util.Scanner;

public class Exercise_17 {
    public static void main(String[] args) {
        MathClassVarargs.Calculator calculator = new MathClassVarargs.Calculator();

        System.out.println(MathClassVarargs.Calculator.computeAddition(0,5,8,5,9,6));
        System.out.println(calculator.computeSubtraction(6,1,2));
        System.out.println(MathClassVarargs.Calculator.computeMultiplication(6,2,5,4,1,5,2,6));
        System.out.println(calculator.computeDivision(6,2));
    }
}