import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WordBankGame
{
    private String[] wordBank;
    private String chosenWord;
    private char[] guessedLetters;
    private int maxLives;
    private int remainingLives;
    private boolean gameOver;

    public WordBankGame(String[] wordBank, int maxLives)
    {
        this.wordBank = wordBank;
        this.maxLives = maxLives;
    }

    public void playGame() // Play the game
    {
        initializeGame();
        while (!gameOver)
        {
            displayGameState();
            char guess = getGuess();
            updateGame(guess);
            checkGameOver();
        }
        displayGameOver();
    }

    private void initializeGame()
    {
        chosenWord = selectRandomWord();
        guessedLetters = new char[chosenWord.length()];
        Arrays.fill(guessedLetters, '_');
        remainingLives = maxLives;
        gameOver = false;
    }

    private String selectRandomWord() // Chooses a word in whichever difficulty the user chose
    {
        Random random = new Random();
        return wordBank[random.nextInt(wordBank.length)];
    }

    private void displayGameState() // Shows the user what the current state of the word is and how many lives are left
    {
        System.out.println("Current word: " + String.valueOf(guessedLetters));
        System.out.println("Remaining lives: " + remainingLives);
    }

    private char getGuess()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        return scanner.next().charAt(0);
    }

    private void updateGame(char guess) // Updates every time the user enters a letter
    {
        boolean letterGuessed = false;
        for (int i = 0; i < chosenWord.length(); i++)
        {
            if (chosenWord.charAt(i) == guess)
            {
                guessedLetters[i] = guess;
                letterGuessed = true;
            }
        }
        if (!letterGuessed)
        {
            remainingLives--;
        }
    }

    private void checkGameOver() // Determines if the game is over or if the user is still eligible to continue
    {
        if (Arrays.equals(guessedLetters, chosenWord.toCharArray()) || remainingLives == 0)
        {
            gameOver = true;
        }
    }

    private void displayGameOver()
    {
        if (Arrays.equals(guessedLetters, chosenWord.toCharArray()))
        {
            System.out.println("Congratulations! You guessed the word: " + chosenWord);
        }
        else
        {
            System.out.println("Game over! The word was: " + chosenWord);
        }
    }
}
