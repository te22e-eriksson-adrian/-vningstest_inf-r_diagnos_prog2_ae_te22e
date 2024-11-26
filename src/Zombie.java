import java.util.ArrayList;
import java.util.Random;

public class Zombie extends Creature{
    Random generator = new Random();

    public int minIntelligenceZombie = 5;
    public int maxIntelligenceZombie = 10;
    public int minEnduranceZombie = 10;
    public int maxEnduranceZombie = 15;

    public ArrayList<Zombie> Zombies = new ArrayList<>();

    public void displayZombies(){
        for (Zombie zombies : Zombies){
            System.out.println("- "+zombies.name);
            System.out.println("  - "+zombies.intelligence);
            System.out.println("  - "+zombies.strength);
            System.out.println("  - "+zombies.endurance);
        }
    }
    public void add(Zombie zombie){
        Zombies.add(zombie);
    }
    public int zombieIntelligence(){
        int result = generator.nextInt(minIntelligenceZombie, maxIntelligenceZombie);
        return result;
    }
    public int zombieEndurance(){
        int result = generator.nextInt(minEnduranceZombie, maxEnduranceZombie);
        return result;
    }
}