package Problem5;


public class ApplianceTest {
    public static void main(String[] args) {
        IAppliance[] appliances = {
                new WashingMachine(7),
                new Refrigerator(4),
                new Microwave(800)
        };
        for (IAppliance appliance : appliances) {
            System.out.println(appliance.getClass().getSimpleName());
            appliance.performFunction();
        }
    }
}
