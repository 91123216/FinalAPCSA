public class MediumWordBankGame extends WordBankGame
{
    private static final String[] WORD_BANK = {"apple", "banana", "blueberries", "cherry", "coconut", "grapes", "kiwi", "mango", "orange", "pineapple", "peach", "pear", "strawberry", "watermelon"};
    private static final int MAX_LIVES = 9;

    public MediumWordBankGame()
    {
        super(WORD_BANK, MAX_LIVES);
    }
}
