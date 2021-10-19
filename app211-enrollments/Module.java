
/**
 * Module class includes code, title and module which is assigned 
 * with a course.
 *
 * @author Youssef El-Guoshi
 * @version 19/10/2021
 */
public class Module
{
    // instance variables - replace the example below with your own
    private String code;
    private String title;
    private Module module;
    private int credit;

    /**
     * Constructor for objects of class Module
     */
    public Module(String code, String title)
    {
       this.code = code;
       this.title = title;
       credit = 0;
    }
/**
 * Gets the code of the module.
 */
    public String getCode()
    {
        return code;
    }
    /**
     * Gets the title of the module.
     */
    public String getTitle()
    {
        return title;
    }
    /**
     * Gets a credit value.
     */
    public int getCredit()
    {
        
        return credit;
    }
    
    /**
     * Sets the credit to a value.
     */
    public void setCredit(int credit)
    {
        this.credit = credit;
    }
    
    /**
     * Prints the module code, title and the credit.
     */
    public void print()
    {
        //printHeading();
        
        System.out.println(" Module Code: " + code + ": " + title);
        System.out.println("Credit: " + credit);
        System.out.println();
    }
}
