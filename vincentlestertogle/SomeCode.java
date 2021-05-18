import java.util.Scanner;

public class SomeCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
//        int n = scan.nextInt();
//
//        String front = str.substring(0, n);
//
//        // Start this substring at n+1 to omit the char.
//        // Can also be shortened to just str.substring(n+1)
//        // which goes through the end of the string.
//        String back = str.substring(n+1, str.length());
//
//        System.out.println(front + back);

//        String first = Character.toString(str.charAt(0));
//        String last = Character.toString(str.charAt(str.length()-1));
//        String leftOver = str.substring(1, (str.length()-1));
//
//        if(str.length()==1){
//            System.out.println(str);
//        }
//
//        System.out.println(last + leftOver + first);

        if(str.length() < 3){
            System.out.println(str + str + str);
        }else {
            System.out.println(str.substring(0,3) + str.substring(0,3) + str.substring(0,3));
        }
    }
}
