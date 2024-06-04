package Problem3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TemperatureSensor implements Sensor {
    String location;
    String lastUpdated;
    double temperature;

    public TemperatureSensor(double temperature, String location) {
        this.temperature = temperature;
        this.location = location;
        updateLastUpdated();
    }


    @Override
    public String getSensorType() {
        return "Temperature";
    }

    @Override
    public double getReading() {
        return temperature;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public String getLastUpdated() {
        updateLastUpdated();
        return lastUpdated;
    }

    private void updateLastUpdated() {
        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm a");
        lastUpdated = formatter.format(new Date());
    }

    public String performAction() {
        if(temperature > 30) {
            return "an alert to turn on the AC";
        } else if(temperature < 18){
            return "an alert to turn on the Heater";
        } else {
            return "Temperature is in normal range";
        }
    }
}
