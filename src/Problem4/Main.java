package Problem4;

public class Main {
    public static void main(String[] args) {
        Employee[] emp = new Employee[5];
        emp[0] = new ComissionEmployee(1000, 5);
        emp[1] = new HourlyEmployee(15, 10);
        emp[2] = new SalariedEmployee(200);
        emp[3] = new BasePlusCommissionEmployee(100, 5, 150);

        var employeeWithMaxSalary = findMaxSalary(emp);
        System.out.println(employeeWithMaxSalary.toString());
    }

    public static Employee findMaxSalary(Employee[] col) {
        Employee max = null;
        double maxSalry = Double.MIN_VALUE;

        for(Employee e : col) {
            if(e != null){
                var payment = e.getPayment();

                if(payment > maxSalry)
                {
                    maxSalry = payment;
                    max = e;
                }
            }
        }

        return max;
    }
}
