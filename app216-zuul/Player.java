
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

    /**
     * Constructor for objects of class Player
     */
    public Player()
    {
        this.health = health;
        this.stamina = stamina;
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
    
    public int getHealth()
    {
        return health;
    }
}
