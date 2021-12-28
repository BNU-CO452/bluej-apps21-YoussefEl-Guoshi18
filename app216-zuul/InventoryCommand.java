
import java.util.ArrayList;
/**
 * Write a description of class HelpCommand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InventoryCommand extends ZuulCommand
{
    public InventoryCommand(Game zuul)
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

        System.out.println(" This is what you current have: ");
        System.out.println();
        
        Player player = zuul.player;
        
        for(Item items : player.inventory)
        {
            System.out.println(items.getName() + "\n");                        
        }   
        
    }
}