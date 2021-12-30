import java.util.ArrayList; 
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
/**
 * Write a description of class Player here.
 *
 * @author Youssef El-Guoshi
 * @version 09/12/2021
 */
public class Player
{
    private int health = 5;
    private int stamina = 15;
    private int luck = 0;
    private int damage = 1;
    public ArrayList<Item> inventory;
    public HashMap<String, Item> inventorys;

    /**
     * Constructor for objects of class Player
     */
    public Player()
    {
        this.health = health;
        this.stamina = stamina;
        this.luck = luck;
        this.damage = damage;
        inventory = new ArrayList<>();
        inventorys = new HashMap<>();
    }

     public void decreaseHealth()
    {
        health = health - 1;
    }
    
    public void setDamage(int set)
    {
        damage = set;
    }
    
    public int getDamage()
    {
        return damage;
    }
    
    public int getLuck()
    {
        return luck;
    }
    
    public Item findItem(String item)
    {
       for(Item items : inventory) 
       {
           if(items.getName().equals(item))
           {
               return items;
           }
       }
       return null;
    }
    
    public void increaseLuck()
    {
        luck = luck + 1;
    }
    
    public void increaseHealth(int amount)
    {
        health = health + amount;
    }
    
        public void decreaseHealth(int amount)
    {
        health = health - amount;
    }
    
    public void decreaseStamina()
    {
        stamina = stamina - 1;
    }
    
    public int getStamina()
    {
        return stamina;
    }
    
    public void addItem(Item item)
    {
        inventory.add(item);
    }
    
    public void removeItem(Item item)
    {
        inventory.remove(item);
    }
    
    public int getHealth()
    {
        return health;
    }
    
    public void setItem(String name, Item item)
    {
        inventorys.put(name, item);
    }
    
    public Item removeItems(String item)
    {
        return inventorys.remove(item);
    }
    
    public Item getItem(String item) 
    {
        return inventorys.get(item);
    }
    
    public boolean treasureUnlocked()
    {
        String returnString = " Inventory:";
        Set<String> keys = inventorys.keySet();
        for(String item : keys)
        {
            returnString += " " + item;
        }
        if(returnString.contains("greenorb") && returnString.contains("redorb") && returnString.contains("blueorb"))
        {
            return true;
        }
        return false;
    }
    
    public String getItemString()
    {
        String returnString = " Inventory:";
        Set<String> keys = inventorys.keySet();
        
        for(String item : keys) 
        {
            returnString += " " + item;
        }
        return returnString;
    }
}
