/**
 * This command allows the player to
 * take or pickup an item from a room
 * and carry it around to use somewhere
 * else
 *
 * @author Youssef El-Guoshi
 * @version 31/12/2021
 */
public class TakeCommand extends ZuulCommand
{
    String item;
    /**
     * Take an item from a location and add it
     * to the player's inventory.
     */
    public TakeCommand(Game zuul, String item)
    {
        super(zuul);
        this.item = item;
    }
    
    /**
     * The method checks to see if the item is included in the location if it is, then the item will be removed from the location and
     * added to the player's inventory. If the String item is null or not even in the location then the method will print out an
     * invalid response to the user.
     */
    public void execute()
    {
        if(item == null)
        {
            // if there is no second word, we don't know what to take...
            System.out.println("Take what?");
            return;
        }
        Map map = zuul.MAP;
        Player player = zuul.player;
        Item items = map.getCurrentLocation().getItem(item);
        if(item == null)
        {
            System.out.println("Item doesn't exist!");
        }
        else if(map.getCurrentLocation().fetchItem().contains(item))
        {
            System.out.println(items.getName() + " is added into your inventory!");
            player.setItem(item, items);
            map.getCurrentLocation().removeItem(item);
            System.out.println(map.getCurrentLocation().getLongDescription());
            player.addItem(items);
        }
        else
        {
            System.out.println("That item doesn't exist!");
        }
        // remove the item from the current room
        // and add it to the player's inventory
    }
}