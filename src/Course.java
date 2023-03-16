import java.util.ArrayList;

public class Course {
    private String courseId;
    private String courseName;
    private Semester semester;
    private ArrayList<Student> students;
    private Teacher teacher;
    public void removeStudentOrTeacher(Person person) {
        if (person instanceof Student) {
            students.remove((Student) person);
        } else if (person instanceof Teacher) {
            teacher = null;
        }
    }
    public void addStudentOrTeacher(Person person) {
        if (person instanceof Student) {
            students.add((Student) person);
            person.addCourse(this);
        } else if (person instanceof Teacher) {
            teacher = (Teacher) person;
            person.addCourse(this);
        }
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public Semester getSemester() {
        return semester;
    }
}
