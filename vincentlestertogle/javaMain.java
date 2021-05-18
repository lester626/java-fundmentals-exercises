import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class javaMain {
    public static void main(String[] args) {
//        String:
//          .valueOf()
//          .indexOf()
//          .concat()
//          .subString()
//          .replace()
//          .charAt()
//          .isEmpty()
//          .isBlank()
//          .trim()

        Scanner scn = new Scanner(System.in);
//        String name = scn.nextLine();
//        String word = "something";

//        Pattern pattern = Pattern.compile("[a-z]");
//        Matcher matcher = pattern.matcher(name);


//        System.out.println(String.valueOf(name));
//        Integer[] integer = new Integer[4];
//
//        for (int i=0; i<4; i++) {
//            int inputInteger = scn.nextInt();
//            integer[i] = inputInteger;
//            System.out.println("next");
//        }
//        for (int j=0; j<4; j++) {
//            System.out.println(integer[j]);
//        }

//        int[][] numbers = new int[2][3];
//        for(int i=0; i<numbers.length; i++){
//            for(int j=0; j<numbers[i].length; j++){
//                numbers[i][j] = j;
//            }
//        }
//        for(int i=0; i<numbers.length; i++){
//            for(int j=0; j<numbers[i].length; j++){
//                System.out.println(numbers[i][j]);
//            }
//        }

//        String testValue = "This is test value";
//        System.out.print(testValue.indexOf("This")); // the value 2 will be displayed
//        System.out.println("Enter a sentence:");
//        String inputWord = scn.nextLine();
//        System.out.println("Enter a word you wanna find:");
//        String findWord = scn.nextLine();
//        Pattern pattern = Pattern.compile(findWord.toLowerCase());
//        Matcher matcher = pattern.matcher(inputWord.toLowerCase());
//        System.out.println(matcher.matches());
//        System.out.println(matcher.find());

//        int[][][] arrayString = new int[5][3][2];
//        int num = 0;
//        for(int i=0; i<arrayString.length; i++) {
//            for(int j=0; j<arrayString[i].length; j++){
//                for(int u=0; u<arrayString[i][j].length; u++) {
//                    num += 1;
//                    arrayString[i][j][u] = num;
//                    System.out.print(arrayString[i][j][u] + "  ");
//                }
//                System.out.println("");
//            }
//            System.out.println("");
//        }

        int[][] nums = {
                {1,2,3},
                {4,5,6},
                {8,9,10}
        };
        int evenSum = 0;
        int oddSum = 0;

        System.out.println("Even Numbers: ");
        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums.length; j++) {
                if(nums[i][j] % 2 == 0) {
                    evenSum += nums[i][j];
                    System.out.print(nums[i][j] + " ");
                }
            }
        }
        System.out.println("");
        System.out.println("Odd Numbers: ");
        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums.length; j++) {
                if(!(nums[i][j] % 2 == 0)) {
                    oddSum += nums[i][j];
                    System.out.print(nums[i][j] + " ");
                }
            }
        }
        System.out.println("\n");
        System.out.println("Sum of even numbers:    " + evenSum);
        System.out.println("Sum of odd numbers:     " + oddSum);
    }
}

//      \d = [0-9]
//      \D = ^[0-9]
//      \w = [a-zA-Z]
//      \W = ^[a-zA-Z]