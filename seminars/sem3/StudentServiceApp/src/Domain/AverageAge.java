package Domain;

import java.util.List;

public class AverageAge<E extends User> {
    public static <E extends User> Double getAvgAge(List<E> people) {
        Double avg = 0.0;
        for (E age : people) {
            avg = avg + age.getAge();
        }
        avg = avg / people.size();
        return avg;
    }
}
