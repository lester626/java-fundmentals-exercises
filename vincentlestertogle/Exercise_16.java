import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercise_16 {
    public static void main(String[] args) {
        LocalDateTime oneWeekFromNow = LocalDateTime.now().plusWeeks(1);
        LocalDateTime oneMonthBefore = LocalDateTime.now().minusMonths(1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm a");

        String dateWeekFromNow = oneWeekFromNow.format(formatter);
        String dateMonthBefore = oneMonthBefore.format(formatter);

        System.out.println("One week from now: " + dateWeekFromNow);
        System.out.println("One month before: " + dateMonthBefore);
    }
}
