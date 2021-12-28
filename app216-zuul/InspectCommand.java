/**
 * This command allows the player to
 * take or pickup an item from a room
 * and carry it around to use somewhere
 * else
 *
 * @author Derek Peacock & Nicholas Day
 * @version 2021-08-23
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
        
        for(Item findItem : player.inventory)
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
        
        // remove the item from the current room
        // and add it to the player's inventory
        // Print out a suitable message.
    }
}