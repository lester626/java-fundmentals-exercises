public class Exercise_12 {
    public static void main(String[] args) {
        ComputeNumbers computeInputNumbers = new ComputeNumbers();
        System.out.println("Addition:       " + computeInputNumbers.addition(5, 5, 7));
        computeInputNumbers.subtraction(8, 5);
        System.out.println("Multiplication: " + computeInputNumbers.multiplication(4, 2, 4, 1));
        computeInputNumbers.division(8, 4);
    }
}