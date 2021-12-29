import java.util.ArrayList; 
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
    public ArrayList<Item> inventory;

    /**
     * Constructor for objects of class Player
     */
    public Player()
    {
        this.health = health;
        this.stamina = stamina;
        inventory = new ArrayList<>();
    }

     public void decreaseHealth()
    {
        health = health - 1;
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
    
     public void increaseHealth()
    {
        health = health + 1;
    }
    
     public void decreaseStamina()
    {
        stamina = stamina - 1;
    }
    
    public int getStamina()
    {
        return stamina;
    }
    
    public boolean itemFound(String item)
    {
        for(Item items : inventory)
        {
            if(items.getName().equals(item))
            {
                return true;
            }
        }
        return false;
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
}
