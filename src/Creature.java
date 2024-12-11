import java.util.Random;

public class Creature {
    // Variabler
    public String name;
    public int intelligence;
    public int strength;
    public int endurance;

    public Random genRandom = new Random();
    public int maxValue = 30;

    // Metoder
    public int playChess(){
        int result = genRandom.nextInt(0, maxValue);
        int endResult = result + intelligence;
        return endResult;
    }
    public int fight(){
        int result = genRandom.nextInt(0, maxValue);
        int endResult = result + strength + endurance;
        return endResult;
    }
    public int armWrestling(){
        int result = genRandom.nextInt(0, maxValue);
        int endResult = result + strength;
        return endResult;
    }
}
