package src.ComparableAndCompara;

import java.util.Comparator;

public class NameComparator implements Comparator<StudentComparator> {
    // Comparator is an interface, so we can implement Comparator interface and whose class data sort like StudentComparator
    // Implement method compare,

    @Override
    public int compare(StudentComparator o1, StudentComparator o2) {
        // compare to String name
        // will write our logic and provide compareTo() method

        return o1.getName().compareTo(o2.getName());
    }
}
