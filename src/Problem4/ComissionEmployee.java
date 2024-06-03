package Problem4;

public class ComissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public ComissionEmployee(double grossSales, double commissionRate) {
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    @Override
    public String toString() {
        return "ComissionEmployee [grossSales=" + grossSales + ", commissionRate=" + commissionRate + "]";
    }

    @Override
    double getPayment() {
        return grossSales * commissionRate;
    }
}
