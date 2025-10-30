package ass_agg_com;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    private List<Course> courseTeaching;
    public Teacher(String name) {
        this.name = name;
        this.courseTeaching = new ArrayList<>();
    }
    public void assignCourse(Course course) {
        courseTeaching.add(course);
    }
}
