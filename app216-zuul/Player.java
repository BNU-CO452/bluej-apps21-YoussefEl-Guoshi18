import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
/**
 * This is the player class, to set the player's attribute and update its status such as health,
 * damage, luck, etc. Used getter and setter methods to update the player.
 *
 * @author Youssef El-Guoshi
 * @version 31/12/2021
 */
public class Player
{
    private int health = 5;
    private int stamina = 15;
    private int luck = 0;
    private int damage = 1;
    public ArrayList <Item> inventory;
    public HashMap <String, Item> inventorys;
    /**
     * Constructor for objects of class Player
     */
    public Player()
    {
        this.health = health;
        this.stamina = stamina;
        this.luck = luck;
        this.damage = damage;
        inventory = new ArrayList <>();
        inventorys = new HashMap <>();
    }
    
    /**
     * Decrease health of the player.
     */
    public void decreaseHealth()
    {
        decreaseHealth(1);
    }
    
    /**
     * Set the damage of the player, depending what Item it obtained.
     */
    public void setDamage(int set)
    {
        damage = set;
    }
    
    /**
     * Return the player's damage.
     */
    public int getDamage()
    {
        return damage;
    }
        
    /**
     * Return the player's luck.
     */
    public int getLuck()
    {
        return luck;
    }
    
    /**
     * Find the item in the player's inventory.
     */
    public Item findItem(String item)
    {
        for(Item items: inventory)
        {
            if(items.getName().equals(item))
            {
                return items;
            }
        }
        return null;
    }
    
    /**
     * Increase the player's luck.
     */
    public void increaseLuck()
    {
        luck = luck + 1;
    }
    
    /**
     * Increase the player's health depending on the "amount" it set to.
     */
    public void increaseHealth(int amount)
    {
        health = health + amount;
    }
        
    /**
     * Decrease the player's health depending on the "amount" it set to.
     */
    public void decreaseHealth(int amount)
    {
        health = health - amount;
    }
    
    /**
     * Decrease the stamina of the player whenever they move between rooms.
     */
    public void decreaseStamina()
    {
        stamina = stamina - 1;
    }
    
    /**
     * Get the player's stamina.
     */
    public int getStamina()
    {
        return stamina;
    }
    
    /**
     * Add an item into the player's inventory.
     */
    public void addItem(Item item)
    {
        inventory.add(item);
    }
    
    /**
     * Remove an item into the player's inventory.
     */
    public void removeItem(Item item)
    {
        inventory.remove(item);
    }
    
    /**
     * Get the player's health.
     */
    public int getHealth()
    {
        return health;
    }
    
    /**
     * Set the item's name and the item itself to the player's inventory.
     */
    public void setItem(String name, Item item)
    {
        inventorys.put(name, item);
    }
    
    /**
     * Remove the item from the player's inventory.
     */
    public Item removeItems(String item)
    {
        return inventorys.remove(item);
    }
    
    /**
     * Get the string item(as the key) to fetch Item item.
     */
    public Item getItem(String item)
    {
        return inventorys.get(item);
    }
    
    /**
     * Checks if the player's has redorb, greenob and blueorb to unlock the treasureroom.
     */
    public boolean treasureUnlocked()
    {
        String returnString = " Inventory:";
        Set <String> keys = inventorys.keySet();
        for(String item: keys)
        {
            returnString += " " + item;
        }
        if(returnString.contains("greenorb") && returnString.contains("redorb") && returnString.contains("blueorb"))
        {
            return true;
        }
        return false;
    }
    
    /**
     * Get the item string that is currently in the player's inventory.
     */
    public String getItemString()
    {
        String returnString = " Inventory:";
        Set <String> keys = inventorys.keySet();
        for(String item: keys)
        {
            returnString += " " + item;
        }
        return returnString;
    }
}