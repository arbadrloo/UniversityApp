import java.util.ArrayList;

public class Student extends Person {


    public Student(String id, String name, ArrayList<Course> courses) {
        super(id, name, courses);
    }

    public ArrayList<Course> getCoursesTaken() {
        return courses;
    }

    public void addCourseTaken(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }
    public void addCourse(Course course){

    }
    public void setName(){

    }
}
