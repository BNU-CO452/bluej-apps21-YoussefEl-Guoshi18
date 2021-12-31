/**
 * This contains all the possible command words
 * for the game of Zuul
 *
 * @author Youssef El-Guoshi
 * @version 31/12/2021
 */
public enum CommandWords
{
    GO   ("go","Exit location in <direction>"),
    TAKE ("take", "Take <item> from location"),
    HELP ("help", "List all available commands"),
    INVENTORY("inventory", "List the item the player obtained"),
    QUIT ("quit", "End the game"),
    INSPECT ("inspect", "looks at the detail of the item"),
    USE ("use","can use the item to increase the player's stats"),
    BATTLE("battle","fighting the dragon");
    
    public final String word;
    public final String description;
    
    /**
     * Contructor for CommandWords that uses two String value: word and description.
     */
    CommandWords(String word, String description)
    {
        this.word = word;
        this.description = description;
    }
}
