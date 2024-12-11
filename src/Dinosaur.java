import java.util.Random;

public class Dinosaur extends Creature{
    Random generator = new Random();

    public int minIntelligenceDino = 10;
    public int maxIntelligenceDino = 15;
    public int minEnduranceDino = 5;
    public int maxEnduranceDino = 10;

    public Dinosaur(){
        intelligence = dinoIntelligence();
        endurance = dinoEndurance();
        strength = 40;
    }

    public int dinoIntelligence(){
        int result = generator.nextInt(minIntelligenceDino, maxIntelligenceDino);
        return result;
    }
    public int dinoEndurance(){
        int result = generator.nextInt(minEnduranceDino, maxEnduranceDino);
        return result;
    }
}
