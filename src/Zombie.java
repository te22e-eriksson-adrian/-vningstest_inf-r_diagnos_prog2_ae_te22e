import java.util.Random;

public class Zombie extends Creature{
    Random generator = new Random();

    public int minIntelligenceZombie = 5;
    public int maxIntelligenceZombie = 10;
    public int minEnduranceZombie = 10;
    public int maxEnduranceZombie = 15;

    public int zombieIntelligence(){
        int result = generator.nextInt(minIntelligenceZombie, maxIntelligenceZombie);
        return result;
    }
    public int zombieEndurance(){
        int result = generator.nextInt(minEnduranceZombie, maxEnduranceZombie);
        return result;
    }
}