
/**
 * The Enemy only has one attribute "health" that can be reduced by the player.
 *
 * @author Youssef El-Guoshi
 * @version 31/12/2021
 */
public class Enemy
{
    // instance variables - replace the example below with your own
    private int health = 30;

    public Enemy()
    {
     this.health = health;
    }
    
    /**
     * Decrease the enemy's health.
     */
    public void decreaseHealth(int amount)
    {
      health = health - amount;
    }
    
    /**
     * Get the enemy's health.
     */
    public int getHealth()
    {
      return health;
    }
}
