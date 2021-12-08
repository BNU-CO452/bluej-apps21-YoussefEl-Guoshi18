
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
    
    private Location cabinet, buttery, bathroom, cellar, solar;

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

        currentLocation = cabinet;  // start game outside
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
    }
    
    /**
     * Create the theatre linked to the outside
     */
    private void createButtery()
    {
        buttery = new Location("You enter the buttery and a reeking smell of rotten bread comes right into your nostrils.");
        
        buttery.setExit("north", cabinet);
        cabinet.setExit("south", buttery);
    }
    
    /**
     * Create the office linked to the lab
     */
    private void createSolar()
    {
        solar = new Location("You enter the Solar room and you see recrudescence of insects under the chimney.");
        
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
    
        private void createCellar()
    {
        // create the Locations
        cellar = new Location("You enter the cellar, it's pitch black and if you have a useful item, it'll be easier to explore.");
        
        cellar.setExit("south", solar);
        solar.setExit("north", cellar);
        
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
