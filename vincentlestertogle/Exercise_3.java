import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 20) + 1;
        int numberGuess = 0;
//        System.out.println("The Random Number: " + randomnumber);

        while (numberGuess != randomNumber) {
            System.out.print("Guess a Number: ");
            numberGuess = scn.nextInt();
            if(numberGuess > randomNumber){
                System.out.println("Try again. Your guess is too high.");
                System.out.println("");
            } else if(numberGuess < randomNumber){
                System.out.println("Try again. Your guess is too low.");
                System.out.println("");
            } else {
                System.out.println("You guessed it right!");
                break;
            }
        }
    }
}
