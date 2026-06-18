import java.util.Scanner;
import java.util.Random;
 
public class DiceRoller {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean running = true;
 
        System.out.println("========================================");
        System.out.println("             DICE ROLLER 🎲             ");
        System.out.println("========================================");
 
        while (running) {
            System.out.println("\nWhat kind of die do you want to roll?");
            System.out.println("  1. D6  (6 sided)");
            System.out.println("  2. D12 (12 sided)");
            System.out.println("  3. D20 (20 sided)");
            System.out.println("  0. Quit");
            System.out.print("\nChoose: ");
 
            int choice = scanner.nextInt();
 
            if (choice == 0) {
                System.out.println("\nThanks for playing! 🎲");
                running = false;
                break;
            }
 
            int sides;
            switch (choice) {
                case 1: sides = 6;  break;
                case 2: sides = 12; break;
                case 3: sides = 20; break;
                default:
                    System.out.println("Invalid choice. Pick 1, 2, 3, or 0.");
                    continue;
            }
 
            System.out.print("How many dice do you want to roll? ");
            int numDice = scanner.nextInt();
 
            if (numDice < 1 || numDice > 20) {
                System.out.println("Please roll between 1 and 20 dice.");
                continue;
            }
 
            // Roll the dice
            System.out.println("\n--- Rolling " + numDice + "x D" + sides + " ---");
            int total = 0;
            for (int i = 1; i <= numDice; i++) {
                int roll = random.nextInt(sides) + 1;
                System.out.println("  Die " + i + ": " + roll);
                total += roll;
            }
 
            System.out.println("  ----------------------");
            System.out.println("  Total: " + total);
 
            if (numDice > 1) {
                System.out.printf("  Average: %.1f%n", (double) total / numDice);
            }
 
            // Fun reactions
            if (sides == 20 && total == 20 && numDice == 1) {
                System.out.println("  NATURAL 20! CRITICAL HIT! 🔥");
            } else if (sides == 20 && total == 1 && numDice == 1) {
                System.out.println("  Critical fail... rough. 💀");
            } else if (total == sides * numDice) {
                System.out.println("  PERFECT ROLL! 🎯");
            }
        }
 
        scanner.close();
    }
}
