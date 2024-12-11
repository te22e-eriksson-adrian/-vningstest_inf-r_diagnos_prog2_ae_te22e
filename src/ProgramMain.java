// Importerar viktiga filer från javabiblioteket som behövs för att programmet ska fungera.
import java.util.ArrayList;
import java.util.Scanner;

public class ProgramMain {
    //Listor för att hålla reda på olika typer av varelser (Creature).
    public ArrayList<Dinosaur> dinos = new ArrayList<>();
    public ArrayList<Zombie> zombies = new ArrayList<>();

    public ProgramMain(){
        // Skanner för att kunna avläsa inmatningar från enhetens tangentbord.
        Scanner keyboard = new Scanner(System.in);

        System.out.println("You have to choose the amount of dinosaurs or zombies in each team.");
        System.out.println();
        System.out.println("How many in each team?");
        System.out.print("Amount in Dino-team: ");
        int amount_d = keyboard.nextInt();
        keyboard.nextLine();
        for (int i = 0; i < amount_d; i++){
            Dinosaur dino = new Dinosaur();
            dinos.add(dino);
        }
        System.out.print("Amount in Zombie-team: ");
        int amount_z = keyboard.nextInt();
        keyboard.nextLine();
        for (int i = 0; i < amount_z; i++){     
            Zombie zombie = new Zombie();       
            zombies.add(zombie);
        }

        keyboard.close();
    }
    public void displayDinos(){
        for (Dinosaur dino : dinos){
            System.out.println("- "+dino.name);
            System.out.println("  - "+dino.intelligence);
            System.out.println("  - "+dino.strength);
            System.out.println("  - "+dino.endurance);
        }
    }
    public void displayZombies(){
        for (Zombie zombie : zombies){
            System.out.println("- "+zombie.name);
            System.out.println("  - "+zombie.intelligence);
            System.out.println("  - "+zombie.strength);
            System.out.println("  - "+zombie.endurance);
        }
    }
}
