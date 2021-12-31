/**
 *  This class is the main class of the "World of Zuul" application.
 *  "World of Zuul" is a very simple, text based adventure game.  Users
 *  can walk around some scenery. That's all. It should really be extended
 *  to make it more interesting!
 *
 *  To play this game, create an instance of this class and call the "play"
 *  method.
 *
 *  This main class creates and initialises all the others: it creates all
 *  locations, creates the CommandReader and starts the game.
 *
 * @author  Youssef El-Guoshi
 * @version 31/12/2021
 *
 * Modified and extended by Youssef El-Guoshi
 */
public class Game
{
    public final Map MAP;
    private CommandReader reader;
    public Player player;
    public Enemy enemy;
    private boolean gameOver;
    /**
     * Create the game and initialise its internal map.
     */
    public Game()
        {
            MAP = new Map();
            reader = new CommandReader(this);
            player = new Player();
            enemy = new Enemy();
        }
        
        /**
         *  Main play routine.  Loops until end of play. The player wins the game by getting the dragon health to zero or the player loses if their
         *  health is set to zero.
         */
    public void play()
        {
            printWelcome();
            gameOver = false;
            // Enter the main command loop.  Here we repeatedly 
            // read commands and execute them until the game is over.
            while(!gameOver && enemy.getHealth() > 0 && player.getHealth() > 0)
            {
                gameOver = reader.getCommand();
            }
            if(player.getStamina() == 1)
            {
                System.out.println("Seems like you tired yourself out, you'll now rot in this dungeon, goodbye for now.");
            }
            else if(enemy.getHealth() <= 0)
            {
                System.out.println("YOU WIN! The treasure is all yours!");
            }
            else if(player.getHealth() <= 0)
            {
                System.out.println("Unlucky! You got slained by the dragon!");
            }
        }
        
        /**
         * Print out the opening message for the player.
         */
    private void printWelcome()
    {
        System.out.println();
        System.out.println(" Welcome to the World of Zuul!");
        System.out.println(" World of Zuul is a new, incredibly boring adventure game.");
        System.out.println(" Your goal is to slay the Dragon and take the treasure, try not to die!");
        System.out.println(" Type 'help' if you need help.");
        System.out.println("Your player currently has " + player.getStamina() + " stamina and " + player.getHealth() + " health.");
        System.out.println();
        System.out.println(MAP.getCurrentLocation().getLongDescription());
    }
}