
/**
 * Write a description of class Module here.
 *
 * @author Youssef El-Guoshi
 * @version 05/10/2021
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

    public String getCode()
    {
        return code;
    }
    
    public String getTitle()
    {
        return title;
    }
    public int getCredit()
    {
        
        return credit;
    }
    
    public void setCredit(int credit)
    {
        this.credit = credit;
    }
    
    public void print()
    {
        //printHeading();
        
        System.out.println(" Module Code: " + code + ": " + title + " Credit: " + credit);
        System.out.println();
    }
}
