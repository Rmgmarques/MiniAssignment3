import java.util.ArrayList;
import java.util.Iterator;

public class CourseExecution {

    public int year;
    public ESemester semester;
    public Course course;
    public ArrayList<Student> students;
    public ArrayList<Support> supports;

    public CourseExecution(int year, String semester, Course course){
        this.year = year;
        this.semester = ESemester.valueOf(semester);
        this.course = course;
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Support> supports = new ArrayList<>();
    }

    public void addStudent( Student student){ students.add(student); }

    public void remStudent( Student student){ students.remove(student); }

    public Iterator<Student> getStudents(){ return students.iterator(); }


    public void addSupport( Support support){ supports.add(support); }

    public void remSupport( Support support){ supports.remove(support); }

    public Iterator<Support> getSupports(){ return supports.iterator(); }
}
