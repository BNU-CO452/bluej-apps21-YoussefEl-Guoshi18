
/**
 * These are the grades used by BNU to classify 
 * students at the completion of their course
 * Each value is the top percentage mark for that grade
 * @author Youssef El-Guoshi
 * @version 26/10/2021
 */

/**
 * Grades class has grades that are assigned to each number in brackets, the final integer "value" can contain one value cannot be changed.
 */
public enum Grades
{
    NS (0), 
    F  (39), 
    D  (49), 
    C  (59), 
    B  (69), 
    A  (100);
    
    private final int value;
    
    /**
     * A contructor that has one parameter which is an integer. Assigns the value from the parameter into the value which is stored
     * in the object of the class.
     */
    private Grades(int value)
    {
        this.value = value;
    }
    
    /**
     * A getter method that fetches the variable "value".
     */
    public int getValue()
    {
        return value;
    }
}
