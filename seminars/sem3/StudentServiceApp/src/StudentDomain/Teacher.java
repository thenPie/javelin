package StudentDomain;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends User {

    private Long id;
    private static List<Long> idTeacher = new ArrayList<>();
    
    public Teacher(String lastName, String firstName, Integer age, Long id) {
        super(lastName, firstName, age);

        /**
         * Check if ID already exists.
         */
        Boolean containsID = idTeacher.contains(id);
        if (!(containsID)) {
            
            this.id = id;
            idTeacher.add(id);
        } else {
            setLastName(null);
            setFirstName(null);
            setAge(null);
            setId(null);
        }
    }

    private void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public static List<Long> getIdTeacher() {
        return idTeacher;
    }

    @Override
    public String toString() {
        return super.toString() + " " +
                "Teacher{" +
                "id=" + id +
                '}';
    }
}
