import java.util.regex.Pattern;
import static java.lang.Math.PI;

public class Exercise_11 {
    public static void main(String[] args) {
        String[][] months = new String[4][3];
        months[0] = new String[]{"January", "February", "March"};
        months[1] = new String[]{"April", "May", "June"};
        months[2] = new String[]{"July", "August", "September"};
        months[3] = new String[]{"October", "November", "December"};

        for(int i=0; i<months.length; i++){
            for(int j=0; j<months[i].length; j++){
                if(Pattern.matches("[\\d\\D]+ber", months[i][j].toLowerCase())){
                    System.out.println(months[i][j]);
                }
            }
        }

        // print all months that ends with -ber
    }
}
