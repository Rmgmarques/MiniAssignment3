import java.util.ArrayList;
import java.util.Iterator;

public class Student extends UniversityMember {

    public int matNo;
    public ArrayList<CourseExecution> coursesC;

    public Student(String firstName, String lastName, int ssNo, int matNo) {
        super(firstName, lastName, ssNo);
        this.matNo = matNo;
        ArrayList<CourseExecution> coursesC = new ArrayList<>();
    }

    public void addCourseExecution( CourseExecution courseC){ coursesC.add(courseC); }

    public void remCourseExecution( CourseExecution courseC){ coursesC.remove(courseC); }

    public Iterator<CourseExecution> getCoursesExecution(){ return coursesC.iterator(); }
}
