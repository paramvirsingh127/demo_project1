package src.ComparableAndCompara;

import java.util.Comparator;

public class RollnoComparator implements Comparator<StudentComparator> {

    @Override
    public int compare(StudentComparator o1, StudentComparator o2) {
        // we want to compare by integer roll no than write our logic
        return o1.getRollno()- o2.getRollno();

    }
}
