import java.rmi.StubNotFoundException;
import java.util.Comparator;

import seminar3.Student;

public class StudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        String familyName1 = o1.getFullName().split("\\s", 2)[1];
        String familyName2 = o2.getFullName().split("\\s", 2)[1];
        return familyName1.compareTo(familyName2);
    }

    
}
