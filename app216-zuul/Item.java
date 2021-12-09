import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
/**
 * Write a description of class Item here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item
{
    // instance variables - replace the example below with your own
    private HashMap<String, Location> items;
    private String description;
    /**
     * Constructor for objects of class Item
     */
    public Item(String description)
    {
        // initialise instance variables
        this.description = description;
        items = new HashMap<>();
    }

    public void setItems(String item, Location neighbor) 
    {
        items.put(item, neighbor);
    }
    
    public String getLongDescription()
    {
        return " This is the item avaliable: " + "\n" + getItemString();
    }
    
    private String getItemString()
    {
     String returnItem = "Items: ";
     Set<String> keys = items.keySet();
     for(String item : keys)
     {
        returnItem += " " + item;
     }
     return returnItem;
    }
    
    public Location getItem(String item)
    {
        return items.get(item);
    }
}
