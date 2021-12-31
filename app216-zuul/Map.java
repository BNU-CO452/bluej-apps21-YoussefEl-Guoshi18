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
 * @version 31/12/2021
 */
public class Map
{
    // Need to add a list of exits
    private Location cabinet, buttery, bathroom, lightcellar, solar, bedchamber;
    public Location chapel, treasureroom;
    public boolean inTreasureRoom = false;
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
    * Set the current location to the cabinet.
    * Both locations need to have been created before
    * their exists are linked.
    */
    private void createLocations()
        {
            createCabinet();
            createButtery();
            createBathroom();
            createSolar();
            createBedchamber();
            createChapel();
            currentLocation = cabinet; // start game in the cabinet.
        }
        
    /**
    * Create the cabinet including its description as @param
    */
    private void createCabinet()
        {
            cabinet = new Location("You enter the cabinet, you see rodents gushing out of the forbidden shelfs.");
        }
        
    /**
    * Create the bathroom and also setting the exits that link this location to the cabinet and also contains the item "cellarkey".
    */
    private void createBathroom()
        {
            bathroom = new Location("You enter the bathroom and you witness a spider coming out of those rusty taps.");
            bathroom.setExit("south", cabinet);
            cabinet.setExit("north", bathroom);
            bathroom.setItem("cellarkey", new Item("cellarkey", "An abandoned key found on the floor."));
        }
        
    /**
    * Create the Buttery linked to the cabinet and set the room to have item "steak" and "clover".
    */
    private void createButtery()
        {
            buttery = new Location("You enter the buttery and a reeking smell of rotten bread comes right into your nostrils.");
            buttery.setExit("north", cabinet);
            cabinet.setExit("south", buttery);
            buttery.setItem("steak", new Item("steak", "A steak has been left for a while now, seems out of date would you like to give it a try?"));
            buttery.setItem("clover", new Item("clover", "You found a clover, hopefully its useful later."));
        }
        
    /**
    * Create the solar linked to the cabinet, and created a clover and the redorb to the treasureroom.
    */
    private void createSolar()
        {
            solar = new Location("You enter the Solar room and you see recrudescence of insects under the chimney. The door to the cellar seems to be locked.");
            solar.setExit("west", cabinet);
            cabinet.setExit("east", solar);
            solar.setItem("redorb", new Item("redorb", "Nice, you found a shiny red Orb to unlock the treasure room!"));
            solar.setItem("clover2", new Item("clover2", "A clover hopefully its more useful soon!"));
        }
        
    /**
    * Create the cellar and link it to the Solar and create items "clover" and "blueorb".
    */
    public void createLightCellar()
       {
           // create the Locations
           lightcellar = new Location("you entered into the creeky cellar seeing pests scattering about.");
           lightcellar.setExit("south", solar);
           solar.setExit("north", lightcellar);
           lightcellar.setItem("clover3", new Item("clover3", "Nice you found a clover!"));
           lightcellar.setItem("blueorb", new Item("blueorb", "GREAT, you found the blue orb."));
       }
       
    /**
     * Create the BedChamber that links with the Solar and create the item "greenorb".
     */   
    private void createBedchamber()
       {
           // create the Locations
           bedchamber = new Location("You enter the bed chamber, seeing rats tearing mattress off from the bed.");
           bedchamber.setExit("north", solar);
           solar.setExit("south", bedchamber);
           bedchamber.setItem("greenorb", new Item("greenorb", "GREAT, you found the green orb."));
       }
    
    /**
     * Create the Chapel and links to the Solar room and creates a cross that can spawn items when used.
     */
    public void createChapel()
       {
           // create the Locations
           chapel = new Location("You enter the Chapel, all the seats are empty but you see a cross on the table. Maybe you can pray, who knows? Something good may happen to you.");
           chapel.setExit("west", solar);
           solar.setExit("east", chapel);
           chapel.setItem("cross", new Item("cross", "lets see what you can retrieve!"));
       }
    
    /**
     * Create the room that links with Chapel and can fight with the dragon.
     */
    public void createTreasureroom()
       {
           // create the Locations
           treasureroom = new Location("You enter the treasure room, ITS TIME to fight off the dragon! Type 'battle' to begin.");
           inTreasureRoom = true;
           treasureroom.setExit("west", chapel);
           chapel.setExit("east", treasureroom);
       }
       
    /**
     * Fetch the currentlocation that the player is currently at.
     */
    public Location getCurrentLocation()
       {
           return currentLocation;
       }
       
    /**
     * Allows the player to enter one location to the other.
     */
    public void enterLocation(Location nextLocation)
       {
           currentLocation = nextLocation;
       }
}