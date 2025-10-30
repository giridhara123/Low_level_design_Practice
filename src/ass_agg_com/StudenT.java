package ass_agg_com;

import java.util.ArrayList;
import java.util.List;

public class StudenT {

    private String name;
    private List<Course> Courses;

    public StudenT(String name) {

        this.name = name;
        this.Courses = new ArrayList<>();
    }
    public void addCourse(Course course) {
        Courses.add(course);
    }
}
