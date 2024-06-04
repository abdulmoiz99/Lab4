package Problem6.Case1;

public class TestClass {
    public static void main(String[] args) {
        Bird bird1 = new Bird("Arara", "Blue");
        Bird bird2 = new Bird("Arara", "Blue");
        Bird bird3 = new Bird("Canarinho", "Yellow");

        System.out.println("bird1.equals(bird2): " + bird1.equals(bird2));
        System.out.println("bird2.equals(bird3): " + bird2.equals(bird3));

        BirdWithSound birdWithSound1 = new BirdWithSound("Arara", "Blue", "Squawk");
        BirdWithSound birdWithSound2 = new BirdWithSound("Arara", "Blue", "Chirp");

        System.out.println("bird1.equals(birdWithSound1): " + bird1.equals(birdWithSound1));
        System.out.println("birdWithSound1.equals(birdWithSound2): " + birdWithSound1.equals(birdWithSound2));
    }
}
