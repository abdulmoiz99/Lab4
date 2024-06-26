package Problem5;

public class Refrigerator implements IAppliance {
    private final int temperature;

    public Refrigerator(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public void performFunction() {

        System.out.println("Cooling items at temperature: " + temperature + "°C.");
    }
}
