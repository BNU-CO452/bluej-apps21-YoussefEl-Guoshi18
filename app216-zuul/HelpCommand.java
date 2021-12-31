import java.util.ArrayList;
/**
 * HelpCommand will allow the user to look at the possible options for the player to interact with the game.
 *
 * @author Youssef El-Guoshi
 * @version 31/12/2021
 */
public class HelpCommand extends ZuulCommand
{
    public HelpCommand(Game zuul)
    {
        super(zuul);
    }
    
        /**
         * Print out some help information.
         * Here we print some stupid, cryptic message and
         * a list of the command words.
         */
    public void execute()
    {
        System.out.println();
        System.out.println(" Your command words are:");
        System.out.println();
        for(CommandWords command: CommandWords.values())
        {
            System.out.println(" " + command.word + "\t  : " + command.description);
        }
        System.out.println();
        System.out.println(" e.g. go west, take gold");
        System.out.println();
        System.out.println(zuul.MAP.getCurrentLocation().getLongDescription());
    }
}