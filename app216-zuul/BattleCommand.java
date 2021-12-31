import java.util.Scanner;
import java.util.Random;
/**
 * BattleCommand will allow the user to make the choice in a random scenario pick the right choice their player has the
 * advantage, the player needs to set the dragon's health to zero in order to win the game.
 *
 * @author Youssef El-Guoshi
 * @version 31/12/2021
 */
public class BattleCommand extends ZuulCommand
{
    private Random random;
    private Scanner reader;
    public BattleCommand(Game zuul)
        {
            super(zuul);
            this.random = new Random();
            reader = new Scanner(System.in);
        }
        
    /**
     * It firstly checks to see if the player is in the treasureroom before the battle start the int "random" will have value 1-7 which will give the 
     * player random scenarios, if the the player or dragon's health is NOT at zero it'll keep looping until either the dragon or the player
     * is dead. There is a switch statement depending on the user's response which makes the player have the advantage or not.
     */
    public void execute()
    {
        Map map = zuul.MAP;
        Player player = zuul.player;
        Enemy enemy = zuul.enemy;
        if(map.inTreasureRoom)
        {
            while(player.getHealth() > 0 && enemy.getHealth() > 0)
            {
                int randoms = random.nextInt(7) + 1;
                if(randoms == 1)
                {
                    System.out.println("The dragon is charging directly at you, what you going to do:");
                    System.out.println("Attack");
                    System.out.println("Dodge");
                    switch(getString())
                    {
                        case "attack":
                            System.out.println("You decided to charge at the dragon which caused you to lose HP!");
                            player.decreaseHealth(2);
                            System.out.println("Health: " + player.getHealth() + " , " + "Damage: " + player.getDamage() + " : " + " Dragon's health: " + enemy.getHealth());
                            break;
                        case "dodge":
                            System.out.println("Great choice! The dragon smash its head against the wall.");
                            enemy.decreaseHealth(2);
                            System.out.println("Health: " + player.getHealth() + " , " + "Damage: " + player.getDamage() + " : " + " Dragon's health: " + enemy.getHealth());
                            break;
                        default:
                            System.out.println("Invalid response, you take damage anyway.");
                            player.decreaseHealth(2);
                            System.out.println("Health: " + player.getHealth() + " , " + "Damage: " + player.getDamage() + " : " + " Dragon's health: " + enemy.getHealth());
                    }
                }
                if(randoms == 2)
                {
                    System.out.println("The dragon is dazed what are you going to do:");
                    System.out.println("Attack");
                    System.out.println("Wait");
                    switch(getString())
                    {
                        case "wait":
                            System.out.println("You missed your chances! But you regained a little health");
                            player.increaseHealth(2);
                            System.out.println("Health: " + player.getHealth() + " , " + "Damage: " + player.getDamage() + " : " + " Dragon's health: " + enemy.getHealth());
                            break;
                        case "attack":
                            System.out.println("Great choice! You dealt " + player.getDamage() + " damage!");
                            enemy.decreaseHealth(player.getDamage());
                            System.out.println("Health: " + player.getHealth() + " , " + "Damage: " + player.getDamage() + " : " + " Dragon's health: " + enemy.getHealth());
                            break;
                        default:
                            System.out.println("Invalid response, you take damage anyway.");
                            player.decreaseHealth(2);
                            System.out.println("Health: " + player.getHealth() + " , " + "Damage: " + player.getDamage() + " : " + " Dragon's health: " + enemy.getHealth());
                    }
                }
                if(randoms == 3)
                {
                    System.out.println("The dragon is charging above you:");
                    System.out.println("Slide");
                    System.out.println("Jump");
                    switch(getString())
                    {
                        case "slide":
                            System.out.println("Nice choice! The dragon hurt itself against the wall.");
                            enemy.decreaseHealth(2);
                            System.out.println("Health: " + player.getHealth() + " , " + "Damage: " + player.getDamage() + " : " + " Dragon's health: " + enemy.getHealth());
                            break;
                        case "jump":
                            System.out.println("Good job! You jumped right into the dragon lost HP.");
                            player.decreaseHealth(3);
                            System.out.println("Health: " + player.getHealth() + " , " + "Damage: " + player.getDamage() + " : " + " Dragon's health: " + enemy.getHealth());
                            break;
                        default:
                            System.out.println("Invalid response, you take damage anyway.");
                            player.decreaseHealth(2);
                            System.out.println("Health: " + player.getHealth() + " , " + "Damage: " + player.getDamage() + " : " + " Dragon's health: " + enemy.getHealth());
                    }
                }
                if(randoms == 4)
                {
                    System.out.println("The dragon is charging under you:");
                    System.out.println("Slide");
                    System.out.println("Jump");
                    switch(getString())
                    {
                        case "jump":
                            System.out.println("Nice choice! The dragon hurt itself against the wall.");
                            enemy.decreaseHealth(2);
                            System.out.println("Health: " + player.getHealth() + " , " + "Damage: " + player.getDamage() + " : " + " Dragon's health: " + enemy.getHealth());
                            break;
                        case "silde":
                            System.out.println("Good job! You slid right into the dragon lost HP.");
                            player.decreaseHealth(3);
                            System.out.println("Health: " + player.getHealth() + " , " + "Damage: " + player.getDamage() + " : " + " Dragon's health: " + enemy.getHealth());
                            break;
                        default:
                            System.out.println("Invalid response, you take damage anyway.");
                            player.decreaseHealth(2);
                            System.out.println("Health: " + player.getHealth() + " , " + "Damage: " + player.getDamage() + " : " + " Dragon's health: " + enemy.getHealth());
                    }
                }
                if(randoms == 5)
                {
                    System.out.println("The dragon is tired.");
                    System.out.println("Attack");
                    System.out.println("Wait");
                    switch(getString())
                    {
                        case "attack":
                            System.out.println("Nice choice! You dealt " + player.getDamage() + " damage!");
                            enemy.decreaseHealth(player.getDamage());
                            System.out.println("Health: " + player.getHealth() + " , " + "Damage: " + player.getDamage() + " : " + " Dragon's health: " + enemy.getHealth());
                            break;
                        case "wait":
                            System.out.println("You decided to wait for the dragon to get up, but you regained health!");
                            player.increaseHealth(2);
                            System.out.println("Health: " + player.getHealth() + " , " + "Damage: " + player.getDamage() + " : " + " Dragon's health: " + enemy.getHealth());
                            break;
                        default:
                            System.out.println("ok");
                            System.out.println("Health: " + player.getHealth() + " , " + "Damage: " + player.getDamage() + " : " + " Dragon's health: " + enemy.getHealth());
                    }
                }
                if(randoms == 6)
                {
                    System.out.println("The dragon is breathing fire from the left side, where should you move?");
                    System.out.println("Left");
                    System.out.println("Right");
                    switch(getString())
                    {
                        case "left":
                            System.out.println("Terrible choice! You took damage from the fire!");
                            player.decreaseHealth(5);
                            System.out.println("Health: " + player.getHealth() + " , " + "Damage: " + player.getDamage() + " : " + " Dragon's health: " + enemy.getHealth());
                            break;
                        case "right":
                            System.out.println("Good choice! Avoid te dragon's fire.");
                            System.out.println("Health: " + player.getHealth() + " , " + "Damage: " + player.getDamage() + " : " + " Dragon's health: " + enemy.getHealth());
                            break;
                        default:
                            System.out.println("Invalid response, you take damage anyway.");
                            player.decreaseHealth(5);
                            System.out.println("Health: " + player.getHealth() + " , " + "Damage: " + player.getDamage() + " : " + " Dragon's health: " + enemy.getHealth());
                    }
                }
                if(randoms == 7)
                {
                    System.out.println("The dragon is breathing fire from the right side, where should you move?");
                    System.out.println("Left");
                    System.out.println("Right");
                    switch(getString())
                    {
                        case "left":
                            System.out.println("Good choice! Avoid te dragon's fire.");
                            System.out.println("Health: " + player.getHealth() + " , " + "Damage: " + player.getDamage() + " : " + " Dragon's health: " + enemy.getHealth());
                            break;
                        case "right":
                            System.out.println("Terrible choice! You took damage from the fire!");
                            player.decreaseHealth(5);
                            System.out.println("Health: " + player.getHealth() + " , " + "Damage: " + player.getDamage() + " : " + " Dragon's health: " + enemy.getHealth());
                            break;
                        default:
                            System.out.println("Invalid response, you take damage anyway.");
                            player.decreaseHealth(5);
                            System.out.println("Health: " + player.getHealth() + " , " + "Damage: " + player.getDamage() + " : " + " Dragon's health: " + enemy.getHealth());
                    }
                }
            }
        }
        else
        {
            System.out.println("Who are you even fighting?");
            System.out.println(map.getCurrentLocation().getLongDescription());
        }
    }
    
    /**
     * Fetches the users input.
     */
    public String getString()
    {
        String inputLine = "";
        System.out.print(" > ");
        inputLine = reader.nextLine().toLowerCase();
        return inputLine;
    }
}
        
    
    
