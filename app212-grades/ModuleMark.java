
/**
 * The class "ModuleMark" will contain two attributes mark and module. The module is the object from the Module class and the mark which 
 * is an integer will assign a mark which goes with the module which is set to 0.
 *
 * @author Youssef El-Guoshi
 * @version 26/10/2021
 */
public class ModuleMark
{
    private int mark;
    private Module module;
    
    /**
     * Constructor for objects of class ModuleMark
     */
    public ModuleMark(Module module)
    {
        mark = 0;
        this.module = module;
    }
    /**
     * A getter method that fetches the mark value.
     */
    public int getValue()
    {
        return mark;
    }
    
    /**
     * If the mark is 40% or more then the 
     * student is awarded the module's credit.
     */
    public int getCredit()
    {
        if(mark <= Grades.F.getValue())
        {
            return 0;
        }
        else
        {
            return Module.CREDIT;
        }
    }
    /**
     * A setter method that can set a mark to the attribute of the object "mark".
     */
    public void setMark(int mark)
    {
        this.mark = mark;
    }
    /**
     * A getter method that can get the module value.
     */
    public Module getModule()
    {
        return module;
    }
    
    /**
     * Print the module details and any credit
     * that has been awarded.
     */
    public void print()
    {
        module.print();
        System.out.print("\t  " + getCredit() + "\t" + mark);
    }
}
