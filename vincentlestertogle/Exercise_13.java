import java.util.Scanner;

public class Exercise_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter height of triangle: ");
        double height = scan.nextDouble();
        System.out.print("Enter side a of triangle: ");
        double a = scan.nextDouble();
        System.out.print("Enter side b(base) of triangle: ");
        double base = scan.nextDouble();
        System.out.print("Enter side c of triangle: ");
        double c = scan.nextDouble();

        Triangle triangle = new Triangle(base, height, a, c);

//        triangle.setBase(base);
//        triangle.setHeight(height);
//        triangle.setSideA(a);
//        triangle.setSideC(c);

        double triangleBase = triangle.getBase();
        double triangleHeight = triangle.getHeight();
        double triangleSideA = triangle.getSideA();
        double triangleSideC = triangle.getSideC();

        triangle.printAreaAndPerimeter(triangle.getArea(triangleBase, triangleHeight),
                triangle.getPerimeter(triangleSideA, triangleBase, triangleSideC));
    }
}
