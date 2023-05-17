package Domain;

// work in progress

import java.util.ArrayList;
import java.util.List;

public class Teacher extends User {

    private Long id;
    private String degree;
    private static List<Long> idTeacher = new ArrayList<>();
    
    public Teacher(String lastName, String firstName, Integer age, Long id, String degree) {
        super(lastName, firstName, age);
        this.degree = degree;

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

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Long getId() {
        return id;
    }

    public String getDegree() {
        return degree;
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
