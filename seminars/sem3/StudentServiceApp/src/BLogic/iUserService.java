package BLogic;

import java.util.List;

public interface iUserService<E> {
    List<E> getAll();

    void create(String lastName, String firstName, Integer age);
}
