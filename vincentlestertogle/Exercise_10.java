public class Exercise_10 {
    public static void main(String[] args) {


        // Using the nums array:
        // compute for the sum of the even numbers
        // compute for the sum of the odd numbers

        int[][] nums = {
                {1,2,3},
                {4,5,6},
                {8,9,10}
        };
        int evenSum = 0;
        int oddSum = 0;

        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums.length; j++) {
                if(nums[i][j] % 2 == 0) {
                    evenSum += nums[i][j];
                    System.out.println("Even:   " + nums[i][j]);
                } else {
                    oddSum += nums[i][j];
                    System.out.println("Odd:    " + nums[i][j]);
                }
            }
        }

        System.out.println("Sum of even numbers:    " + evenSum);
        System.out.println("Sum of odd numbers:     " + oddSum);

    }
}
