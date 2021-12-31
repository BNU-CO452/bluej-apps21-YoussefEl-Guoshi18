/**
 * The UseCommand allows the player to the user the item in their inventory, which can boost the player's status or even unlock a new location.
 *
 * @author Youssef El-Guoshi
 * @version 31/12/2021
 */
public class UseCommand extends ZuulCommand
{
    String item;
    /**
     * Take an item from a location and add it
     * to the player's inventory.
     */
    public UseCommand(Game zuul, String item)
       {
           super(zuul);
           this.item = item;
       }
       
    /**
     * Checks if the item is in the inventory, if it is then they can boost the player's status, spawn items, etc. Or if not,
     * prints out an invalid message.
     */   
    public void execute()
        {
            if(item == null)
            {
                // if there is no second word, we don't know what to take...
                System.out.println("What am I using?");
                return;
            }
            Map map = zuul.MAP;
            Player player = zuul.player;
            Item items = player.getItem(item);
            Location chapel = map.chapel;
            if(items == null)
            {
                System.out.println("The item doesn't exist!");
            }
            else if(items.getName().equals("steak"))
            {
                player.increaseHealth(1);
                System.out.println("Nice! Your HP increased!");
                player.removeItems(item);
            }
            else if(items.getName().equals("cellarkey"))
            {
                map.createLightCellar();
                System.out.println("Cellar room unlocked!");
                System.out.println(map.getCurrentLocation().getLongDescription());
                player.removeItems(item);
            }
            else if(items.getName().equals("clover"))
            {
                player.increaseLuck();
                System.out.println("Luck increased!");
                System.out.println(map.getCurrentLocation().getLongDescription());
                player.removeItems(item);
            }
            else if(items.getName().equals("clover2"))
            {
                player.increaseLuck();
                System.out.println("Luck increased!");
                System.out.println(map.getCurrentLocation().getLongDescription());
                player.removeItems(item);
            }
            else if(items.getName().equals("clover3"))
            {
                player.increaseLuck();
                System.out.println("Luck increased!");
                System.out.println(map.getCurrentLocation().getLongDescription());
                player.removeItems(item);
            }
            else if(items.getName().equals("cross"))
            {
                if(player.getLuck() == 1)
                {
                    chapel.setItem("luckysteak", new Item("luckysteak", "Ayy, a lucky steak good for you"));
                }
                else if(player.getLuck() == 2)
                {
                    chapel.setItem("forbiddensword", new Item("forbiddensword", "Good job, you have obtained the forbidden sword."));
                }
                else if(player.getLuck() == 3)
                {
                    chapel.setItem("goldensword", new Item("goldensword", "AMAZING, you obtained the GOLDEN sword."));
                }
                else
                {
                    System.out.println("You got nothing.");
                }
                System.out.println("Hopefully thats useful.");
                System.out.println(map.getCurrentLocation().getLongDescription());
                player.removeItems(item);
            }
            else if(items.getName().equals("luckysteak"))
            {
                player.increaseHealth(4);
                System.out.println(map.getCurrentLocation().getLongDescription());
                System.out.println("HP increased!");
                player.removeItems(item);
            }
            else if(items.getName().equals("forbiddensword"))
            {
                player.setDamage(3);
                System.out.println("ForbiddenSword equipped!");
                System.out.println(map.getCurrentLocation().getLongDescription());
                player.removeItems(item);
            }
            else if(items.getName().equals("goldensword"))
            {
                player.setDamage(10);
                System.out.println("Goldensword equipped!");
                System.out.println(map.getCurrentLocation().getLongDescription());
                player.removeItems(item);
            }
            else
            {
                System.out.println("Never heard of that item.");
            }
        }

}