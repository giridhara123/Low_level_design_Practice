package ass_agg_com;

import java.util.ArrayList;
import java.util.List;
public class School {
    private String name;
    private List<Department> departments;
    private List<StudenT> students;
    private Addresss addresss;

    public School(String name, Addresss addresss)
    {
        this.departments = new ArrayList<>();
        this.students = new ArrayList<>();
        this.addresss = addresss;
        this.name = name;
    }

    public void AddDepartment(String name)
    {
        departments.add( new Department(name));
    }
    public void enrollStudent(StudenT student)
    {
        students.add(student);
    }


}
