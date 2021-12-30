
/**
 * Write a description of class Enemy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Enemy
{
    // instance variables - replace the example below with your own
    private int health = 30;

    public Enemy()
    {
     this.health = health;
    }

    public void decreaseHealth(int amount)
    {
      health = health - amount;
    }
    
    public int getHealth()
    {
      return health;
    }
}
