import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Student implements Comparable<Student>{
    String name;
    int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

@Override
public int compareTo(Student anotherStudent){
      //  return anotherStudent.name.compareTo(this.name);
    if(this.name.equals(anotherStudent.name) ){
        return anotherStudent.age-this.age;
    }
     return this.name.compareTo(anotherStudent.name);
}

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Student s1 = new Student("shukur",22);
        Student s2 = new Student("nawaz",20);
        Student s3 = new Student("ishtaq",20);
        Student s4 = new Student("ishtaq",24);
        Student s5 = new Student("shukur",24);
        List<Student> studentList = new LinkedList<>();

       studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        Collections.sort(studentList);
        System.out.println(studentList);

    }
}
