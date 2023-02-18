import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        int result = s1.getName().compareTo(s2.getName());
        if (result == 0) {
            return Integer.compare(s1.getAge(), s2.getAge());
        }
        return result;
    }
}
