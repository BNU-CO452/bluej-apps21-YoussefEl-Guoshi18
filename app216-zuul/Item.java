
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
    int id;

    /**
     * Constructor for objects of class Item
     */
    public Item(String name, String description, int id)
    {
      this.name = name;
      this.description = description;
      this.id = id;
    }

    public String getName()
    {
        return name;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public int getId()
    {
        return id;
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
