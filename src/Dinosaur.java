import java.util.ArrayList;
import java.util.Random;

public class Dinosaur extends Creature{
    Random generator = new Random();

    public int minIntelligenceDino = 10;
    public int maxIntelligenceDino = 15;
    public int minEnduranceDino = 5;
    public int maxEnduranceDino = 10;

    public ArrayList<Dinosaur> Dinos = new ArrayList<>();

    public void displayDinos(){
        for (Dinosaur dinos : Dinos){
            System.out.println("- "+dinos.name);
            System.out.println("  - "+dinos.intelligence);
            System.out.println("  - "+dinos.strength);
            System.out.println("  - "+dinos.endurance);
        }
    }
    public void add(Dinosaur dino){
        Dinos.add(dino);
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
