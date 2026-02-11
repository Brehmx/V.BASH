package gcc.edu.VBASH;

public class Schedule {


    private String name;
    private Iterable<Course> courses;

    public Schedule(String name, Iterable<Course> courses) { }

    public static boolean checkCourseConflict(Course potentialCourse) { return true; }
    public static void addCourse(Course potentialCourse) { return; }
    public static void removeCourse(Course enrolledCourse) { return; }
    public static void replaceCourse(Course oldCourse, Course newCourse) { return; }

    public static Iterable<Course> getCourses() { return null; }

    public String getName() { return null; }
    public void setName(String newName) { return; }
}
