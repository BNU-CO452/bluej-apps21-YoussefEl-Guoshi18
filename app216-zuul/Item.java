/**
 * The Item class contains the name and description and has getter method to fetch value. 
 *
 * @author Youssef El-Guoshi
 * @version 31/12/2021
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
    
    /**
     * Gets the name of the object.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Gets the description of the object.
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * Prints the name of the object.
     */
    public void getShortDescription()
    {
        System.out.println(name);
    }
    
}