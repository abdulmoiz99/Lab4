package Problem6.Case1;

public class BirdWithSound extends Bird {
    private String sound;

    BirdWithSound(String species, String color, String sound) {
        super(species, color);
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
}
