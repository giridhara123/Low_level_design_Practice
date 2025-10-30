package ass_agg_com;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private String teacher;
    private List<StudenT> enrolledStudents;

    public Course(String name, String teacher) {
        this.name = name;
        this.teacher = teacher;
        enrolledStudents = new ArrayList<>();
    }

    public void enrollStudent(StudenT student) {
        enrolledStudents.add(student);
        student.addCourse(this);

    }

}
