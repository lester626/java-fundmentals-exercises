public class Triangle {
    private double base;
    private double height;
    private double sideA;
    private double sideC;

    public Triangle(double base, double height, double sideA, double sideC){
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideC = sideC;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) { this.height = height; }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) { this.sideA = sideA; }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getArea(double base, double height){
        return (base * height) / 2;
    }

    public double getPerimeter(double a, double b, double c){
        return a + b + c;
    }

    public void printAreaAndPerimeter(double area, double perimeter){
        System.out.println("");
        System.out.println("Area of Triangle:       " + area);
        System.out.println("Perimeter of Triangle:  " + perimeter);
    }
}
