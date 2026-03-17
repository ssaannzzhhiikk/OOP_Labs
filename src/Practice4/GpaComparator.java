package Practice4;

import java.util.Comparator;


public class GpaComparator implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {
        // Descending: higher GPA comes first
        return Double.compare(b.getGpa(), a.getGpa());
    }
}
