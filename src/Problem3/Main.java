package Problem3;

public class Main {
    public static void main(String[] args) {
        Sensor[] sensors = new Sensor[5];
        sensors[0] = new LightSensor(80.0, "Garden");
        sensors[1] = new SoundSensor(65.0, "Bedroom");
        sensors[2] = new TemperatureSensor(23.5, "Living Room");
        sensors[3] = new LightSensor(120.0, "Kitchen");
        sensors[4] = new SoundSensor(75.0, "Office");

        for (Sensor sensor : sensors) {
            System.out.println("Sensor Type: " + sensor.getSensorType());
            System.out.println("Reading: " + sensor.getReading());
            System.out.println("Location: " + sensor.getLocation());
            System.out.println("Last Updated: " + sensor.getLastUpdated());
            System.out.println("Action: " + sensor.performAction());
            System.out.println();
        }
    }

}
