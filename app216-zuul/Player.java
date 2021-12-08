
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
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

     private void decreaseHealth()
    {
        health = health - 1;
    }
    
     private void decreaseStamina()
    {
        stamina = stamina - 1;
    }
}
