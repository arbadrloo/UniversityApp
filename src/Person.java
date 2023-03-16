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

    public final void addCourse(Course course) {
        courses.add(course);
        course.addStudentOrTeacher(this);
    }


    public final void removeCourse(Course course) {
        courses.remove(course);
        course.removeStudentOrTeacher(this);

    }

    public abstract void setName();

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
}

