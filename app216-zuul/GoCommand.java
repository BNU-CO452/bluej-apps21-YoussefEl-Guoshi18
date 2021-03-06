/**
 * This command transfers the player from
 * one location to another location provided the
 * two locations are linked by a valid exit
 *
 * @author Youssef El-Guoshi
 * @version 31/12/2021
 */
public class GoCommand extends ZuulCommand
{
    String direction;
    public GoCommand(Game zuul, String direction)
    {
        super(zuul);
        this.direction = direction;
    }
    
    /**
     * This allows the player to move from one location to the other if the user gives a valid response, if there an empty string or an invalid
     * String then the method will print out a invalid message to the user.
     */
    public void execute()
    {
        if(direction == null)
        {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return;
        }
        Map map = zuul.MAP;
        Player player = zuul.player;
        // Try to leave current room.
        Location currentLocation = map.getCurrentLocation();
        Location nextLocation = currentLocation.getExit(direction);
        if(player.treasureUnlocked())
        {
            map.createTreasureroom();
        }
        if(player.getStamina() != 0)
        {
            if(nextLocation == null)
            {
                System.out.println("There is no exit in this direction!");
            }
            else
            {
                map.enterLocation(nextLocation);
                System.out.println(map.getCurrentLocation().getLongDescription());
                player.decreaseStamina();
                System.out.println("You now have " + player.getStamina() + " stamina , " + player.getHealth() + " health and " + player.getLuck() + " luck.");
            }
        }
        else
        {
            System.out.println("Oh no seems like you ran out of stamina!");
        }
    }
}