import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        System.out.println("Enter multiple number to see if it is Odd or Even: ");

        for(int i=0; i < numbers.length; i++){
            numbers[i] = i+1;
        }

        for(int j=0; j<numbers.length; j++) {
            System.out.print("Input number " + numbers[j] + " is: ");
            if(numbers[j] % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
    }
}
