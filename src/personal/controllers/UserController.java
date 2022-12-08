package personal.controllers;

import personal.model.Repository;
import personal.model.User;

import java.util.List;

public class UserController {
    private final Repository repository;

    public UserController(Repository repository) {
        this.repository = repository;
    }

    public void saveUser(User user) throws Exception {
        validateUser(user);
        repository.CreateUser(user);
    }

    public User readUser(String userId) throws Exception {
        return repository.readUser(userId);

    }

    public List<User> readUserList() {
        return repository.getAllUsers();
    }

    public User updateUser(User user) throws Exception {
        validateUser(user);
        return repository.updateUser(user);
    }
private void validateUser(User user) throws Exception {
        if(user.getFirstName().isEmpty()){
            throw new Exception("Name not found");
        }
    if(user.getLastName().isEmpty()){
        throw new Exception("LastName not found");
    }
    if(user.getPhone().isEmpty()){
        throw new Exception("Phone not found");
    }

}

}

