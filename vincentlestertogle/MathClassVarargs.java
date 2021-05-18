public class MathClassVarargs {
    public static class Calculator{
        public static double computeAddition(double ... numbers){
            double sum = 0;
            for(int i=0; i<numbers.length; i++){
                sum += numbers[i];
            }
            return sum;
        }

        public double computeSubtraction(double num1, double num2, double num3){
            return num1-num2-num3;
        }

        public static double computeMultiplication(double ... numbers){
            double mul = 1;
            for(int i=0; i<numbers.length; i++){
                mul *= numbers[i];
            }
            return mul;
        }

        public double computeDivision(double num1, double num2){
            if(num1 < num2){
                return num2 / num1;
            }
            return num1 / num2;
        }
    }
    public Calculator init(){
        return new Calculator();
    }
}