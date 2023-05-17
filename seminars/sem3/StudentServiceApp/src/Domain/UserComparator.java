package Domain;

import java.util.Comparator;

public class UserComparator<E extends User> implements Comparator<E> {

    @Override
    public int compare(E o1, E o2) {

        int resOfComparing = o1.getFirstName().compareTo(o2.getFirstName());

        if (resOfComparing == 0) {
            resOfComparing = o1.getLastName().compareTo(o2.getLastName());
        }
        return resOfComparing;
    }

}
