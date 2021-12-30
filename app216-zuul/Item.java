
/**
 * Write a description of class Item here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item
{
    // instance variables - replace the example below with your own
    String name;
    String description;

    /**
     * Constructor for objects of class Item
     */
    public Item(String name, String description)
    {
      this.name = name;
      this.description = description;
    }

    public String getName()
    {
        return name;
    }
    
    public String getDescription()
    {
        return description;
    }
    

    
    public void getShortDescription()
    {
        System.out.println(name);
    }
    
    public void getLongDescription()
    {
        System.out.println(name);
    }
}
