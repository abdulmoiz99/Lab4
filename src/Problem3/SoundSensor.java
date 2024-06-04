package Problem3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SoundSensor implements Sensor {
    private String location;
    private String lastUpdated;
    private double soundLevel;


    public SoundSensor(double soundLevel, String location) {
        this.soundLevel = soundLevel;
        this.location = location;
        updateLastUpdated();
    }

    @Override
    public String getSensorType() {
        return "Sound";
    }

    @Override
    public double getReading() {
        return soundLevel;
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
        if(soundLevel > 70) {
            return "an alert to turn on noise cancellation";
        } else {
            return "Sound is within normal range";
        }
    }
}
