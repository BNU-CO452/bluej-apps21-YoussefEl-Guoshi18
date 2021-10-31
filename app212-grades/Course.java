import java.util.ArrayList;
/**
 * This class stores information about a course
 * that enrolled students may want to complete
 *
 * @author Youssef El-Guoshi
 * @version 31/10/2021
 */
/**
 * Class "course" that has attributes, MAXN_MODULES has a value "4" which can't be changed since it contains "final" in its data type. Arraylist "modules"
 * thats takes in the object of the class "Module" and store into an array. String code and title provides information about the object of this class.
 * Grades finalGrade will give the student the overall grade across the four modules.
 */
public class Course
{
    public final static int MAXN_MODULES = 4;
    
    public ArrayList<Module> modules;
    public ArrayList<Student> students;
    private String code;
    private String title;
    
    private Grades finalGrade;
     
/**
 * Its a automation, that will immediately assign the course's code and title to "BT1GDV1", "BSc Games Development". Which then creates a new array list
 * for that course and start another automation using the method createModules().
 */
    public Course()
    {
        this("BT1GDV1", "BSc Games Development");
         modules  = new ArrayList<Module>();
         students = new ArrayList<Student>();
        createModules();
    }
    
/**
 * Constructor for objects of class Course
 */
    public Course(String code, String title)
    {
        // initialise instance variables
        this.code = code;
        this.title = title;
        
        modules  = new ArrayList<Module>();
        
        createModules();
    }

/**
 * It's an automation. Add the four modules into the Arraylist modules.
 */
    public void createModules()
    {
    Module co452 = new Module("CO452","Programming Concepts   ");
    Module co450 = new Module("CO450", "Computer Architectures");
    Module co461 = new Module("CO461", "3D Modelling          ");
    Module co459 = new Module("CO459", "Game Design           ");
    
    addModule(co452);
    addModule(co450);
    addModule(co461);
    addModule(co459);
    }
/**
 * Adds the student into the list that got enrolled into the course.
 */    
    public void addStudent(Student student)
    {
        students.add(student);
    }
    
/**
 * This method checks to see if the size of the ArrayList is less then four before adding the module into the ArrayList.
 */
    public void addModule(Module module)
    {
        if(modules.size() < MAXN_MODULES)
        {
            modules.add(module);
        }
    }
    
/**
 * A group of if statements to checks to see if the mark is greater or equal to the low boundaries and if the mark is less than or equal
 * to the upper boundaries if its true the grade will be assigned or else it'll move down to each statement until the condition is reached.
 */
    public Grades convertToGrade(int mark)
    {
        if (mark >= 0  && mark <= 39)
          return Grades.F;
        else if (mark >= 40 && mark <= 49)
          return Grades.D;
        else if (mark >= 50 && mark <= 59)
          return Grades.C;
        else if (mark >= 60 && mark <= 69)
          return Grades.B;
        else if (mark >= 70 && mark <= 100)
          return Grades.A;
        else
          return Grades.NS;
    }
    
    /**
     * Calculate the average mark from the four module marks
     * and convert that into a final grade.
     */
    public Grades calculateGrade(ArrayList<ModuleMark> marks)
    {
        int total = 0;
        int finalMark = 0;
        for(ModuleMark mark: marks)
        {
            total = total + mark.getValue();
        }
        finalMark = total / MAXN_MODULES;
         
        finalGrade = convertToGrade(finalMark);
        return finalGrade;
    }
    
    /**
     * Prints out the details of a course and the
     * four modules
     */
    public void print()
    {
        System.out.println();
        System.out.println(" Course " + code + ": " + title);
        //System.out.println();
        
        printModules();
    }
/**
 * Prints out the list of student that got enrolled to the same course.
 */
      public void printCourseEnrol()
    {
        System.out.println("Lists of student thats has enrolled for Games Development");
        for(Student student: students)
        {
            student.print();
        }
    }
/**
 * Print the course's four modules
 */
    public void printModules()
    {
        for(Module module : modules)
        {
            module.print();
            module.printCredit();
        }
    }
}
