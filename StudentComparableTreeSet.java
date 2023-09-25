import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.Set;
public class StudentComparableTreeSet implements Comparable<StudentComparableTreeSet> {


        String name;
        int age;
        public StudentComparableTreeSet(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(StudentComparableTreeSet anotherStudent){
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
            StudentComparableTreeSet s1 = new StudentComparableTreeSet("shukur",22);
            StudentComparableTreeSet s2 = new StudentComparableTreeSet("nawaz",20);
            StudentComparableTreeSet s3 = new StudentComparableTreeSet("ishtaq",20);
            StudentComparableTreeSet s4 = new StudentComparableTreeSet("ishtaq",24);
            StudentComparableTreeSet s5 = new StudentComparableTreeSet("shukur",24);
            Set<StudentComparableTreeSet> studentList = new TreeSet<>();

            studentList.add(s1);
            studentList.add(s2);
            studentList.add(s3);
            studentList.add(s4);
            studentList.add(s5);
            System.out.println(studentList);

        }
    }
