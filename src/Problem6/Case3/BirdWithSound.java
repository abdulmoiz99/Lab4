package Problem6.Case3;

public class BirdWithSound {
    private Bird bird;
    private String sound;

    BirdWithSound(String species, String color, String sound) {
        bird = new Bird(species, color);
        this.sound = sound;
    }

    public String getSpecies() {
        return bird.getSpecies();
    }

    public String getColor() {
        return bird.getColor();
    }

    public String getSound() {
        return sound;
    }

    @Override
    public boolean equals(Object ob) {
        if(ob == null) return false;
        if(!(ob instanceof BirdWithSound)) return false;
        BirdWithSound birdWithSound = (BirdWithSound) ob;
        return birdWithSound.bird.equals(bird) && birdWithSound.sound.equals(sound);
    }
}
