public class EasyWordBankGame extends WordBankGame
{
    private static final String[] WORD_BANK = {"ant", "bear", "cat", "dog", "dolphin", "eagle", "elephant", "fox", "goat", "horse", "lion", "monkey", "octopus", "owl", "panda", "pig", "rabbit", "snake", "tiger", "wolf", "zebra"};
    private static final int MAX_LIVES = 10;

    public EasyWordBankGame()
    {
        super(WORD_BANK, MAX_LIVES);
    }
}
