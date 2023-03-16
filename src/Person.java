import java.util.*;

public abstract class Person {
protected String id;
protected String name;
protected ArrayList<Course> courses;

    public Person(String id, String name, ArrayList<Course> courses) {
        this.id = id;
        this.name = name;
        this.courses = new ArrayList<Course>();
    }
    public abstract void addCourse(Course course);
//    public abstract void removeCourse(Course course);
public final void removeCourse(Course course) {
    courses.remove(course);
    course.removeStudentOrTeacher(this);
}
    public abstract void setName();
    public  String getId;
    public String getName;
    public Course getCourses;

}
