/**
 * This command allows the player to
 * take or pickup an item from a room
 * and carry it around to use somewhere
 * else
 *
 * @author Derek Peacock & Nicholas Day
 * @version 2021-08-23
 */
public class UseCommand extends ZuulCommand
{
    String item;
    
    /**
     * Take an item from a location and add it
     * to the player's inventory.
     */
    public UseCommand(Game zuul, String item)
    {
        super(zuul);
        this.item = item;
    }    

    public void execute()
    {
        if(item == null) 
        {
            // if there is no second word, we don't know what to take...
            System.out.println("What am I using?");
            return;
        }
        
        Map map = zuul.MAP;
        Player player = zuul.player;
        Item items = player.getItem(item);
        
        if(items.getName().equals("steak"))
        {
            player.increaseHealth();
            System.out.println("Nice! Your HP increased!");
            player.removeItems(item);
        }
        else if(items.getName().equals("cellarkey"))
        {
          map.createLightCellar();
          System.out.println("Cellar room unlocked!");
          System.out.println(map.getCurrentLocation().getLongDescription());
          player.removeItems(item);
        }

        }
        // remove the item from the current room
        // and add it to the player's inventory
        // Print out a suitable message.
    }
