package Domain;

import java.util.ArrayList;
import java.util.List;

public class Student extends User implements Comparable<Student> {

    private Long id;
    private static List<Long> idStudent = new ArrayList<>();
    
    public Student(String lastName, String firstName, Integer age, Long id) {
        super(lastName, firstName, age);

        /**
         * Check if ID already exists.
         */
        Boolean containsID = idStudent.contains(id);
        if (!(containsID)) {
            this.id = id;
            idStudent.add(id);
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

    public static List<Long> getIdStudent() {
        return idStudent;
    }

    @Override
    public String toString() {
        return super.toString() + " " +
                "Student{" +
                "id=" + id +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        // if (getId() == student.getId()) {
        //     return 0;
        // }
        // if (getId() < student.getId()) {
        //     return -1;
        // }
        // return 1;

        // if (super.getAge() == student.getAge()) {
        //     return 0;
        // }
        // if (super.getAge() < student.getAge()) {
        //     return -1;
        // }
        // return 1;

        // System.out.println(super.getFirstName() + " --- " + student.getFirstName());

        if (super.getAge() == student.getAge()) {
            if (this.getId() == student.getId()) {
                return 0;
            }
            if (this.getId() < student.getId()) {
                return -1;
            }
            return 1;
        }
        if (super.getAge() < student.getAge()) {
            return -1;
        }
        return 1;
    }

}
