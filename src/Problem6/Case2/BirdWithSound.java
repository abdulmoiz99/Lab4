package Problem6.Case2;

public class BirdWithSound extends Bird {
    private String sound;

    BirdWithSound(String species, String color, String sound) {
        super(species, color);
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    @Override
    public boolean equals(Object ob) {
        if(ob == null) return false;
        if(getClass() != ob.getClass()) return false;
        BirdWithSound bird = (BirdWithSound) ob;
        return bird.getSpecies().equals(getSpecies()) && bird.getColor().equals(getColor()) && bird.sound.equals(sound);
    }
}
