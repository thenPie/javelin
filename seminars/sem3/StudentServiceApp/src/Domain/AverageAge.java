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

//    public static <T extends Person> void getAverageAge(List<T> list) {
//        int sum = 0;
//        for (T person : list) {
//            sum += person.getAge();
//        }
//        sum /= list.size();
//        System.out.printf("Average Age: %d\n", sum);
//    }

//    public static <E extends User> void getAverageAge(List<E> list) {
//        int sum = 0;
//        for (E person : list) {
//            sum += person.getAge();
//        }
//        sum /= list.size();
//        System.out.printf("Average Age: %d\n", sum);
//    }

}
