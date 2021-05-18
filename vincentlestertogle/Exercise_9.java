public class Exercise_9 {
    public static void main(String[] args) {
        // Print the average 1-10

        int[] numbers = new int[10];
        float average;
        float sum = 0;

        for(int i=0; i<numbers.length; i++) {
            numbers[i] = i+1;
        }

        for(int number : numbers) {
            sum += number;
        }

        average = sum/numbers.length;
        int sumInt = (int) sum;

        System.out.println("Result:     " + sumInt);
        System.out.println("Average:    " + average);
    }
}
