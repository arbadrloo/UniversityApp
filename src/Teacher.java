import java.util.ArrayList;

public class Teacher extends Person{

    public Teacher(String id, String name, ArrayList<Course> courses) {
        super(id, name, courses);
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

    @Override
    public void setName() {

    }
}
