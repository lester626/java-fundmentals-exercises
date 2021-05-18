import java.util.Scanner;

public class ComputeNumbers {

    public int addition(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public void subtraction(int num1, int num2){
        System.out.println("Subtraction:    " + (num1 - num2));
    }

    public int multiplication(int num1, int num2, int num3, int num4){
        return num1 * num2 * num3 * num4;
    }

    public void division(int num1, int num2){
        System.out.println("Division:       " + (num1 / num2));
    }
}
