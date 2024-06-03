package Problem4;

public class SalariedEmployee extends Employee{
    private double weeklySalary;

    public SalariedEmployee(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
    @Override
    public String toString(){
        return "SalariedEmployee [weeklySalary=" + weeklySalary + "]";
    }
    @Override
    double getPayment() {
        return weeklySalary;
    }
}
