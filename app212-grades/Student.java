import java.util.*;
/**
 * The Student class represents a student in a student administration system.
 * It holds the student details relevant in our context.
 * 
 * @author Youssef El-Guoshi
 * @version 26/10/2021
 */
/**
 * A class "Student" contains attributes like int id, String name and Course course which provides information about the object
 * of that class. And it also contain an ArrayList "marks" which can store "ModuleMark".
 */
public class Student
{
    // the student ID
    private int id;
    // the student's full name
    private String name;
    // The course the student is enrolled on
    private Course course;
    // The marks awarded for the modules on the course
    private ArrayList<ModuleMark> marks;
    

    
    /**
     * This constructor creates a new student with a
     * fixed name and id. 
     */
    public Student()
    {
        this("Youssef", 22133675);
    }
    
    /**
     * Create a new student with a given name and ID number.
     */
    public Student(String name, int id)
    {
        this.name = name;
        this.id = id;
        
        marks = new ArrayList<ModuleMark>();
    }
    /**
     * Adds the ModuleMark "mark" into the ArrayList "marks".
     */
    public void addMark(ModuleMark mark)
    {
        marks.add(mark);
    }
    
    /**
     * Find the module by the moduleCode and
     * set its mark to the value
     */
    public void awardMark(String moduleCode, int value)
    {
        for(Module module : course.modules)
        {
            if(module.getCode() == moduleCode)
            {
           //ModuleMark mark = new ModuleMark(module ,value);
            }
        }

       
    }
    
    /**
     * Set the student's course
     */
    public void enrol(Course course)
    {
        this.course = course;
        awardTestMarks();
    }
    
    /**
     * Award a different pass mark for each of the
     * modules on the enrolled course
     */
    public void awardTestMarks()
    {
        int randValue = 60;
        for(Module module : course.modules)
      {
       ModuleMark mark = new ModuleMark(module);
       
       mark.setMark(randValue);
       marks.add(mark);
       randValue = randValue - 10;
      }
      
    }
    
    /**
     * Return the full name of this student.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Return the student ID of this student.
     */
    public int getID()
    {
        return id;
    }

        
    /**
     * Print the student's name and ID number to the 
     * output terminal.
     */
    public void print()
    {
        System.out.println(" Student ID: " + id + ", " + name);
    }
    /**
     * Prints the details of the Student's id and name and the course's code and title which the student is enrolled from.
     */
    public void printCourse()
    {
        this.print();
        course.print();
    }
    /**
     * Using the foreach statement for every "moduleMark" in the ArrayList "marks" convert into the grade for each module.
     */
    private void printModules()
    {
     for(ModuleMark moduleMark: marks)
     {
         moduleMark.print();
         System.out.println("\t" + course.convertToGrade(moduleMark.getValue()));
     }
    }
    /**
     * Prints the entire transcript that contains a grade for each module and the final grades that links to the four modules.
     */
    public void printTranscript()
    {
        System.out.println(" ------------------------------------");
        System.out.println(" App21-02: Exam Board Transcript 2021");
        System.out.println("        by student name");
        System.out.println(" ------------------------------------");
        
        printCourse();
        
        System.out.println();
        System.out.println();
        System.out.println(" ---- \t -------------------- \t ------\t ---- \t -----");
        System.out.println(" Code \t Module \t\tCredit\t Mark \t Grade");
        System.out.println(" ---- \t -------------------- \t ------\t ---- \t -----");
        
        printModules();
       
        Grades finalGrade = course.calculateGrade(marks);
        
        System.out.println();
        System.out.println();
        
        if(finalGrade == Grades.NS)
        {
            System.out.println(" No Final Course Grade Yet!");
        }
        else
        {
            System.out.println(" Final Course Grade = " + finalGrade);
        }
    }
}