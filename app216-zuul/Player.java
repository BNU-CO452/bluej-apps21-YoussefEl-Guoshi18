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
    private ArrayList<Item> inventory;

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
    
    public int getHealth()
    {
        return health;
    }
}
