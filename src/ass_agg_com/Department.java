package ass_agg_com;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;
    private List<Teacher> teachers;
    private List<Course> courses;

    public Department(String name) {
        this.name = name;
        this.teachers = new ArrayList<>();
        this.courses = new ArrayList<>();

    }
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }
}
