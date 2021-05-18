import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercise_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputNumber = scanner.nextLine();

        System.out.println(Pattern.matches("[3-5]{1}[0-9]{9}", inputNumber));
    }
}
