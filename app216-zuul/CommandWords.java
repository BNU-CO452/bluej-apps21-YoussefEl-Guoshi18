
/**
 * This contains all the possible command words
 * for the game of Zuul
 *
 * @author Derek Peacock & Nicholas Day
 * @version 25-08-2021
 */
public enum CommandWords
{
    GO   ("go","Exit location in <direction>"),
    TAKE ("take", "Take <item> from location"),
    HELP ("help", "List all available commands"),
    INVENTORY("inventory", "List the item the player obtained"),
    QUIT ("quit", "End the game"),
    INSPECT ("inspect", "looks at the detail of the item");
    
    public final String word;
    public final String description;
    
    CommandWords(String word, String description)
    {
        this.word = word;
        this.description = description;
    }
}
