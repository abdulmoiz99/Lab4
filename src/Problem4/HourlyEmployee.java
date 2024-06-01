package Problem4;

public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;

    public HourlyEmployee(double wage, double hours) {
        this.wage = wage;
        this.hours = hours;
    }
    @Override
    public String toString(){
        return "HourlyEmployee [wage=" + wage + ", hours=" + hours + "]";
    }
    @Override
    double getPayment() {
        return wage * hours;
    }
}
