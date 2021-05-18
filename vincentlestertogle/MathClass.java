public class MathClass {
    public static class Calculator{
        private static int num1;
        private static int num2;

        public Calculator(int num1, int num2) {
            this.num1 = num1;
            this.num2 = num2;
        }

        public static void addNumbers(){
            System.out.println("Addition: " + Math.addExact(num1, num2));
        }

        public static void subtractNumbers(){
            System.out.println("Subtraction: " + Math.subtractExact(num1, num2));
        }

        public static void multiplyNumbers(){
            System.out.println("Multiplication: " + Math.multiplyExact(num1, num2));
        }

        public static void divideNumbers(){
            System.out.println("Division: " + Math.floorDiv(num1, num2));
        }
    }

    public Calculator init(int a, int b){
        return new Calculator(a, b);
    }
}
