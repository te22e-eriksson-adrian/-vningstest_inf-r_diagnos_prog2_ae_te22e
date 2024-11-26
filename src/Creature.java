import java.util.ArrayList;

public class Creature {
    // Variabler
    public int name;
    public int intelligence;
    public int strength;
    public int endurance;
    public ArrayList<Creature> Creatures = new ArrayList<>();

    // Metoder
    public void displayCreatures(){
        for (Creature creature : Creatures){
            System.out.println("- "+creature.name);
            System.out.println("  - "+creature.intelligence);
            System.out.println("  - "+creature.strength);
            System.out.println("  - "+creature.endurance);
        }
    }
    public void add(Creature creature){
        Creatures.add(creature);
    }
    public void playChess(){
        //jj (return int later)
    }
    public void fight(){
        //jj (return int later)
    }
    public void armWrestling(){
        //jj (return int later)
    }
}
