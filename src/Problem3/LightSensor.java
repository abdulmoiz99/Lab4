package Problem3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LightSensor implements Sensor{
    private String location;
    private String lastUpdated;
    private double lightLevel;


    public LightSensor(double lightLevel, String location) {
        this.location = location;
        this.lightLevel = lightLevel;
        updateLastUpdated();
    }

    private void updateLastUpdated() {
        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm a");
        lastUpdated = formatter.format(new Date());
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public double getReading() {
        return lightLevel;
    }

    @Override
    public String getSensorType() {
        return "Light";
    }


    @Override
    public String getLastUpdated() {
        updateLastUpdated();
        return lastUpdated;
    }

    public String performAction() {
        if(lightLevel < 100) {
            return "an alert to turn on the light";
        } else {
            return "Light is sufficient";
        }
    }
}
