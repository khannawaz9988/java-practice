import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Students implements Comparable<Students>{
    String name;
    int age;
    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

@Override
public int compareTo(Students anotherStudent){
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
        Students s1 = new Students("shukur",22);
        Students s2 = new Students("nawaz",20);
        Students s3 = new Students("ishtaq",20);
        Students s4 = new Students("ishtaq",24);
        Students s5 = new Students("shukur",24);
        List<Students> studentList = new LinkedList<>();

       studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        Collections.sort(studentList);
        System.out.println(studentList);

    }
}
