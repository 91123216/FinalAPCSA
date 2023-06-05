public class HardWordBankGame extends WordBankGame
{
    private static final String[] WORD_BANK = {"alaska", "arizona", "california", "colorado", "florida", "georgia", "hawaii", "illinois", "kansas", "michigan", "nevada", "newyork", "texas", "utah", "washington", "washingtondc", "wisconsin"};
    private static final int MAX_LIVES = 8;

    public HardWordBankGame()
    {
        super(WORD_BANK, MAX_LIVES);
    }
}
