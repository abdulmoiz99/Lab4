package Problem6.Case2;

public class Bird {
    private String species;
    private String color;

    Bird(String species, String color) {
        this.species = species;
        this.color = color;
    }

    public String getSpecies() {
        return species;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object ob) {
        if(ob == null) return false;
        if(getClass() != ob.getClass()) return false;
        Bird bird = (Bird) ob;
        return bird.species.equals(species) && bird.color.equals(color);
    }
}
