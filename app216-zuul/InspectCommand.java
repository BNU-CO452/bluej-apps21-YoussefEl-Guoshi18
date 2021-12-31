/**
 * InspectCommand allows the player to look at the description of the item they currently have, but cannot look for other items that
 * is not in the player's inventory.
 * 
 * @author Youssef El-Guoshi
 * @version 31/21/2021
 */
public class InspectCommand extends ZuulCommand
{
    String item;
    /**
     * Take an item from a location and add it
     * to the player's inventory.
     */
    public InspectCommand(Game zuul, String item)
    {
        super(zuul);
        this.item = item;
    }
    
    /**
     * Checks to see if the item is in the player's inventory. If not, then prints out an invalid to the user 
     * else fetches the description of the item.
     */
    public void execute()
    {
        if(item == null)
        {
            // if there is no second word, we don't know what to take...
            System.out.println("Inspecting what?");
            return;
        }
        Map map = zuul.MAP;
        Player player = zuul.player;
        boolean found = false;
        for(Item findItem: player.inventory)
        {
            if(findItem.getName().equals(item))
            {
                System.out.println(findItem.getDescription());
                found = true;
            }
        }
        if(!found)
        {
            System.out.println("Doesn't seem to be in your inventory, can't inspect it!");
        }
        System.out.println();
        System.out.println(map.getCurrentLocation().getLongDescription());
        // remove the item from the current room
        // and add it to the player's inventory
        // Print out a suitable message.
    }
}