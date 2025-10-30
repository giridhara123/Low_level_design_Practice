import java.util.ArrayList;

public class Student {
    private String Name;
    private int ID ;
    private ArrayList<Integer> grades ;


    //constructor;
    public Student (String name, int id)
    {
        this.Name = name;
        this.ID= id;
        this.grades = new ArrayList<>();
    }
    //methods
    public void addGrade(int grade)
    {
        grades.add(grade);
    }
    public void getsum()
    {
        int sum =0;
        for(int i: grades)
        {
            sum+=i;
        }
        System.out.println(sum);
    }
    public void getaverage()
    {
        int average =0;
        for(int i: grades)
        {
            average+=i;
        }
        average= average/grades.size();
        System.out.println(average);
    }
    //optional getters.
    public String getname()
    {
        return Name;
    }
    public int getid()
    {
        return ID;
    }

}
// Student s = new Student( "giridhar",100);
// s.addGrade(90);
//  s.addGrade(80);
//  s.addGrade(70);
//  s.addGrade(60);
// s.getsum();
// s.getaverage();

// System.out.println(s.getname());
//System.out.println(s.getid());
