import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to WordBank!");
        System.out.println("Only enter letters in lowercase.");
        System.out.println("Select the game difficulty by entering 1, 2, or 3:");
        System.out.println("1. Easy (Animals)");
        System.out.println("2. Medium (Fruits)");
        System.out.println("3. Hard (States in the USA)");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        WordBankGame game;

        if (choice == 1)
        {
            game = new EasyWordBankGame();
        }
        else if (choice == 2)
        {
            game = new MediumWordBankGame();
        }
        else if (choice == 3)
        {
            game = new HardWordBankGame();
        }
        else
        {
            System.out.println("Invalid choice. Exiting the game.");
            return;
        }
        game.playGame(); // Play the game
    } // end main
} // end Main class
