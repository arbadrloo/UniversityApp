import java.util.ArrayList;

public class University {
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;
    private ArrayList<Course> courses;
    private ArrayList<Semester> semesters;

    public University() {
        students = new ArrayList<>();
        teachers = new ArrayList<>();
        courses = new ArrayList<>();
        semesters = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addSemester(Semester semester) {
        semesters.add(semester);
    }

    public static void main(String[] args) {
        University university = new University();

        // create some students
        Student s1 = new Student("s001", "Ali", null);
        Student s2 = new Student("s002", "Reza", null);
        Student s3 = new Student("s003", "Mohsen", null);

        // create some teachers
        Teacher t1 = new Teacher("t001", "Dr. alavi", null);
        Teacher t2 = new Teacher("t002", "Prof. nejati", null);

        // create some courses
        Course c1 = new Course("c001", "Math");
        Course c2 = new Course("c002", "Physics");

        // create some semesters
        Semester sem1 = new Semester("Fall 2022", null, null);
        Semester sem2 = new Semester("Spring 2023", null, null);

        // add students to the university
        university.addStudent(s1);
        university.addStudent(s2);
        university.addStudent(s3);

        // add teachers to the university
        university.addTeacher(t1);
        university.addTeacher(t2);

        // add courses to the university
        university.addCourse(c1);
        university.addCourse(c2);

        // add semesters to the university
        university.addSemester(sem1);
        university.addSemester(sem2);

        // add students to courses
        c1.addStudentOrTeacher(s1);
        c1.addStudentOrTeacher(s2);
        c2.addStudentOrTeacher(s2);
        c2.addStudentOrTeacher(s3);

        // add teacher to courses
        c1.addStudentOrTeacher(t1);
        c2.addStudentOrTeacher(t2);
    }
}

