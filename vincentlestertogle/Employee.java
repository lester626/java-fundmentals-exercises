public class Employee {
    private double rate;
    private int hours;
    private int days;

    public Employee(double rate, int hours, int days){
        this.hours = hours;
        this.rate = rate;
        this.days = days;
    }

    public void computeMonthlyWage(){
        System.out.println("Monthly Wage: " + this.rate * this.hours * this.days);
    }
}
