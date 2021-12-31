import java.util.ArrayList;
/**
 * The InventoryCommand will print out the item the player is currently have in their inventory.
 *
 * @author Youssef El-Guoshi
 * @version 31/12/2021
 */
public class InventoryCommand extends ZuulCommand
{
    public InventoryCommand(Game zuul)
        {
            super(zuul);
        }
    /**
    * Prints out the item that the player currently has.
    */
    public void execute()
    {
        System.out.println();
        Player player = zuul.player;
        System.out.println(player.getItemString());
    }
}