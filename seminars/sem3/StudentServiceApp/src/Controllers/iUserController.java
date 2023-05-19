package Controllers;

import Domain.User;

public interface iUserController<E extends User> {

    public void create(String lastName, String firstName, Integer age);

}
