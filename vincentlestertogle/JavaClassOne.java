import java.util.Scanner;

public class JavaClassOne {
    public static void main(String[] args) {
        JavaClassTwo printNumbers = new JavaClassTwo();
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Numbers 1 and above: ");
        int number = scn.nextInt();
        printNumbers.forLoop(number);
    }
}
