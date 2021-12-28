
/**
 * This class is reponsible for creating and
 * linking all the Locations in the game to
 * form a 2D or 3D network
 *
 *  [Bathroom]      [Cellar]
 *       |              |
 *   [Cabinet]<----->[Solar]<---->[Chapel]<---->[Treasure room]
 *       |              |
 *   [Buttery]      [Bathroom]
 *             
 * @author Youssef El-Guoshi
 * @version 07/12/2021
 */
public class Map
{
    // Need to add a list of exits
    
    private Location cabinet, buttery, bathroom, cellar, solar, bedchamber, chapel, treasureroom;
    private Location currentLocation;

    /**
     * Constructor for objects of class Map
     */
    public Map()
    {
        createLocations();
    }

    /**
     * Create all the Locations and link their exits together.
     * Set the current location to the outside.
     * Both locations need to have been created before
     * their exists are linked.
     */
    private void createLocations()
    {
        createCabinet();
        createButtery();
        createBathroom();
        createSolar();
        createCellar();
        createBedchamber();
        createChapel();
        createTreasureroom();
        currentLocation = cabinet;// start game outside
    }
    
    /**
     * Create the outside and link it to the
     * theatre, lab and pub
     */
    private void createCabinet()
    {
        cabinet = new Location("You enter the cabinet, you see rodents gushing out of the forbidden shelfs.");
    }
    
    /**
     * Create the pub and link it to the outside
     */
    private void createBathroom()
    {
        bathroom = new Location("You enter the bathroom and you witness a spider coming out of those rusty taps.");
        bathroom.setExit("south", cabinet);
        cabinet.setExit("north", bathroom);
        bathroom.setItem("torchlight" , new Item("torchlight", "A rusty torch which has not been touched in a while.", 1));
        bathroom.setItem("cellarkey" , new Item("cellarkey", "An abandoned key found on the floor.", 2));
        
    }
    
    /**
     * Create the theatre linked to the outside
     */
    private void createButtery()
    {
        buttery = new Location("You enter the buttery and a reeking smell of rotten bread comes right into your nostrils.");
        buttery.setExit("north", cabinet);
        cabinet.setExit("south", buttery);
        buttery.setItem("Steak", new Item("Steak", "A steak has been left for a while now, seems out of date would you like to give it a try?", 3));
    }
    
    /**
     * Create the office linked to the lab
     */
    private void createSolar()
    {
        solar = new Location("You enter the Solar room and you see recrudescence of insects under the chimney.");
        solar.setExit("west", cabinet);
        cabinet.setExit("east",solar);
        solar.setItem("redorb", new Item("redorb", "Nice, you found a shiny red Orb to unlock the treasure room!", 4));
        solar.setItem("clover", new Item("clover", "A clover hopefully its more useful soon!", 5));
    }
    
    /**
     * Create the lab and link it to the outside and office
     */
    private void createCellar()
    {
        // create the Locations
        cellar = new Location("You enter the cellar, it's pitch black and if you have a useful item, it'll be easier to explore.");
        cellar.setExit("south", solar);
        solar.setExit("north", cellar);
        
    }
    
        private void createBedchamber()
    {
        // create the Locations
        bedchamber = new Location("You enter the bed chamber, seeing rats tearing mattress off from the bed.");
        bedchamber.setExit("north", solar);
        solar.setExit("south", bedchamber);
        
    }
    
        private void createChapel()
    {
        // create the Locations
        chapel = new Location("You enter the Chapel, all the seats are empty but you see a cross on the table. Maybe you can pray, who knows? Something good may happen to you.");
        chapel.setExit("west", solar);
        solar.setExit("east", chapel);
        
    }
    
     private void createTreasureroom()
    {
        // create the Locations
        treasureroom = new Location("You enter the treasure room, ITS TIME to fight off the dragon! Also there is no turning back now!");
        
        //treasureroom.setExit("west",chapel);
        chapel.setExit("east", treasureroom);
        chapel.setItem("forbiddensword", new Item("forbiddensword", "Nice, it will be a good fight against the dragon!", 6));
        chapel.setItem("goldensword", new Item("goldensword", "AMAZING! The battle with the dragon will be a slice of cake!", 7));
        
    }
    
    public Location getCurrentLocation()
    {
        return currentLocation;
    }
    
    public void enterLocation(Location nextLocation)
    {
        currentLocation = nextLocation;
    }
    
}
