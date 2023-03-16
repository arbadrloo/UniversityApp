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

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public ArrayList<Course> getCourses() {
        return super.getCourses();
    }

    public void setName(){

    }
}
