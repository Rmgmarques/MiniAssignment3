public class Support {

    public Employee employee;
    public CourseExecution courseE;

    public ERole role;
    public float hours;

    public Support(Employee employee, CourseExecution courseE, String role, float hours){
        this.employee = employee;
        this.courseE = courseE;
        this.role = ERole.valueOf(role);
        this.hours = hours;
    }

}
