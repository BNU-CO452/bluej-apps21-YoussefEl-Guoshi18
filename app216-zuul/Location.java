import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
/**
 * Class Location - a location on the map of an adventure game.
 *
 * This class is part of the "World of Zuul" application.
 * "World of Zuul" is a very simple, text based adventure game.
 *
 * A "Location" represents one place in the scenery of the game.  It is
 * connected to other locations via exits.  For each existing exit, the
 * location stores a reference to the neighboring locations.
 *
 * @author  Youssef El-Guoshi
 * Modified by Youssef El-Guoshi
 * @version 31/12/2021
 */
public class Location
{
    private String description;
    private HashMap <String, Location> exits; // stores exits of this room.   
    private Item item;
    private HashMap <String, Item> items;
    /**
     * Create a location described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     */
    public Location(String description)
        {
            this.description = description;
            exits = new HashMap <>();
            items = new HashMap <>();
        }
        
    /**
    * Define an exit from this room.
    * @param direction The direction of the exit.
    * @param neighbor  The room to which the exit leads.
    */
    public void setExit(String direction, Location neighbor)
       {
           exits.put(direction, neighbor);
       }
    
    /**
     * Sets the item, @param name is the name of the item
     * @param item is the object "Item" which is created from the item class.
     */
    public void setItem(String name, Item item)
        {
            this.item = item;
            items.put(name, item);
        }
        
    /**
    * @return The short description of the room
    * (the one that was defined in the constructor).
    */
    public String getShortDescription()
        {
            return description;
        }
        
    /**
    * Return a description of the room in the form:
    *     You are in the kitchen.
    *     Exits: north west
    * @return A long description of this room
    */
    public String getLongDescription()
       {
           return " You are " + description + "\n" + getExitString() + "\n" + getItemString();
       }
    
    /**
     * It returns the method getItemString()
     */
    public String fetchItem()
       {
           return getItemString();
       }
       
        /**
         * Return a string describing the locations's exits,
         * for example "Exits: north west".
         */
    private String getExitString()
       {
           String returnString = " Exits:";
           Set < String > keys = exits.keySet();
           for(String exit: keys)
           { 
               returnString += " " + exit;
           }
           return returnString;
       }
       
    /**
     * Returns the string of the item that is avaliable in the location.
     */
    private String getItemString()
        {
            String returnString = " Items avaliable:";
            Set < String > keys = items.keySet();
            for(String item: keys)
            {
                returnString += " " + item;
            }
            return returnString;
        }

        /**
         * Return the room that is reached if we go from this room in direction
         * "direction". If there is no room in that direction, return null.
         * @param direction The exit's direction.
         * @return The room in the given direction.
         */
    public Location getExit(String direction)
       {
           return exits.get(direction);
       }
       
    /**
     * Using the Hashmap, it fetches the key(String) to access the Item.
     */
    public Item getItem(String item)
       {  
           return items.get(item);
       }
    
    /**
     * Remove the Item from the Hashmap so it isn't displayed again in the location.
     */
    public Item removeItem(String item)
       {
           return items.remove(item);
       }
}