import java.util.Comparator;

public class StudentAgeComparator implements Comparator<StudentComparator> {
    @Override
    public int compare(StudentComparator s1, StudentComparator s2) {
        int nameComparison =s1.name.compareTo(s2.name);
        if(nameComparison!=0){
            return nameComparison;
        }
        return Integer.compare(s2.age,s1.age);
    }

}
