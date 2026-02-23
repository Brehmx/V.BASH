package gcc.edu.VBASH;

import java.util.Map;

public class Search {
    private static Map<String, String[]> professorByDepartment;
    private static Map<String, String[]> courseCodeByDepartment;
    private static String[] keyTerms;

    private static Iterable<Course> filteredCourses;

    private static Filter currentFilter;
    private static Iterable<Course> resultingCourses;

    public static Iterable<Course> filterCourses (Filter providedFilter) { return null; }
    public static Iterable<Course> search(){
        return null;
    }
    public static void resetFilter(){

    }
}
