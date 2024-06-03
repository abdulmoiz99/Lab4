package Problem4;

public class BasePlusCommissionEmployee extends ComissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(double grossSales, double commisionRate, double baseSalary) {
        super(grossSales, commisionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "Base Plus Commission Employee [baseSalary=" + baseSalary + "]";
    }

    @Override
    double getPayment() {
        return super.getPayment() + baseSalary;
    }
}
