import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class StudentComparator {
   public String name;
   public int age;


    public StudentComparator(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentComparator{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        StudentComparator s1 = new StudentComparator("shukur", 22);
        StudentComparator s2 = new StudentComparator("nawaz", 20);
        StudentComparator s3 = new StudentComparator("ishtaq", 20);
        StudentComparator s4 = new StudentComparator("ishtaq", 24);
        StudentComparator s5 = new StudentComparator("shukur", 24);
        List<StudentComparator> studentList = new LinkedList<>();

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        Comparator studentObj=new StudentAgeComparator();
        Collections.sort(studentList,studentObj);
        for (StudentComparator studentComparator : studentList) {
            System.out.println(studentComparator);
        }
    }
}