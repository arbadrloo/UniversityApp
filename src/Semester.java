import java.util.ArrayList;

public class Semester {
    private String semesterId;
    private String semesterName;
    private ArrayList<Course> courses;

    public Semester(String semesterId, String semesterName, ArrayList<Course> courses) {
        this.semesterId = semesterId;
        this.semesterName = semesterName;
        this.courses = new ArrayList<Course>();
    }

    public void setSemesterName(String semesterName) {
        this.semesterName = semesterName;
    }

    public String getSemesterId() {
        return semesterId;
    }
    public void addCourse(Course course){

    }
    public void removeCourse(Course course){

    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
}
