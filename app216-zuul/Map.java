
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
    private Item redOrb, greenOrb, blueOrb, cellarKey, chapelKey, forbiddenSword, goldenSword, torchlight;
    private Location currentLocation;
    private Item getItem;

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
        getItem = torchlight;
    }
    
    /**
     * Create the outside and link it to the
     * theatre, lab and pub
     */
    private void createCabinet()
    {
        torchlight = new Item ("A dusty torch that hasn't been touched in a really long time.");
        cabinet = new Location("You enter the cabinet, you see rodents gushing out of the forbidden shelfs.");
        torchlight.setItems("torchlight", cabinet);
    }
    
    /**
     * Create the pub and link it to the outside
     */
    private void createBathroom()
    {
        bathroom = new Location("You enter the bathroom and you witness a spider coming out of those rusty taps.");
        redOrb = new Item("You found a shiny red orb in the bathroom tub!");
        redOrb.setItems("redorb", bathroom);
        bathroom.setExit("south", cabinet);
        cabinet.setExit("north", bathroom);
        
    }
    
    /**
     * Create the theatre linked to the outside
     */
    private void createButtery()
    {
        buttery = new Location("You enter the buttery and a reeking smell of rotten bread comes right into your nostrils.");
        cellarKey = new Item("Inside one of the moldy bread you found a cellar key!");
        cellarKey.setItems("cellarKey", buttery);
        buttery.setExit("north", cabinet);
        cabinet.setExit("south", buttery);
    }
    
    /**
     * Create the office linked to the lab
     */
    private void createSolar()
    {
        solar = new Location("You enter the Solar room and you see recrudescence of insects under the chimney.");
        blueOrb = new Item("You found a blue Orb under the chimney!");
        blueOrb.setItems("blueorb", solar);
        solar.setExit("west", cabinet);
        cabinet.setExit("east",solar);
    }
    
    /**
     * Create the lab and link it to the outside and office
     */
    private void createCellar()
    {
        // create the Locations
        cellar = new Location("You enter the cellar, it's pitch black and if you have a useful item, it'll be easier to explore.");
        redOrb = new Item("You found a shiny red orb!");
        redOrb.setItems("redorb", cellar);
        cellar.setExit("south", solar);
        solar.setExit("north", cellar);
        
    }
    
        private void createBedchamber()
    {
        // create the Locations
        bedchamber = new Location("You enter the bed chamber, seeing rats tearing mattress off from the bed.");
        chapelKey = new Item("You found the key to the chapel!");
        chapelKey.setItems("chapelkey", bedchamber);
        bedchamber.setExit("north", solar);
        solar.setExit("south", bedchamber);
        
    }
    
        private void createChapel()
    {
        // create the Locations
        chapel = new Location("You enter the Chapel, all the seats are empty but you see a cross on the table. Maybe you can pray, who knows? Something good may happen to you.");
        forbiddenSword = new Item("Nice! You obtained a forbidden sword! Now you can battle the dragon only if you obtained three orbs first.");
        goldenSword = new Item("AMAZING! You obtained a RARE golden sword! The dragon wouldn't stand a chance.");
        forbiddenSword.setItems("forbiddensword", chapel);
        goldenSword.setItems("goldensword", chapel);
        chapel.setExit("west", solar);
        solar.setExit("east", chapel);
        
    }
    
     private void createTreasureroom()
    {
        // create the Locations
        treasureroom = new Location("You enter the treasure room, ITS TIME to fight off the dragon! Also there is no turning back now!");
        
        //treasureroom.setExit("west",chapel);
        chapel.setExit("east", treasureroom);
        
    }
    
    public Location getCurrentLocation()
    {
        return currentLocation;
    }
    
        public Item getCurrentItem()
    {
        return getItem;
    }
    
    
    public void enterLocation(Location nextLocation)
    {
        currentLocation = nextLocation;
    }
    
    public void nextItem(Item nextItem)
    {
        getItem = nextItem;
    }
}
