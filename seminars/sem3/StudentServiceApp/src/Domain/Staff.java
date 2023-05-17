package Domain;

// work in progress

public class Staff extends User {
    private Integer id;

    public Staff(String lastName, String firstName, Integer age, Integer id) {
        super(lastName, firstName, age);
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                '}';
    }
}
