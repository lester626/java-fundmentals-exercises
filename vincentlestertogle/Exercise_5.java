import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercise_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Valid IP Address: ");
        String input = scan.nextLine();

        System.out.println(Pattern.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}", input));
    }
}
