package com.example.homework_1.dao;

import com.example.homework_1.models.Users;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DaoUsers {
    private int id;
    private List<Users> user = new ArrayList<>();


    public void addUsers(Users users) {
        user.add(users);
        users.setId(++id);
    }

    public List<Users> getUsers() {
        return user;
    }

    public Users getUsersId(int id) {
        return user.stream().filter(users -> users.getId() == id).findAny().orElse(null);
    }

    public void updatePerson(int id, Users users) {
        Users usersUpdate = getUsersId(id);
        usersUpdate.setSecond_name(users.getSecond_name());
        usersUpdate.setFirst_name(users.getFirst_name());
        usersUpdate.setSurname(usersUpdate.getSurname());
        usersUpdate.setAge(usersUpdate.getAge());
        usersUpdate.setEmail(usersUpdate.getEmail());
        usersUpdate.setTelephone(usersUpdate.getTelephone());
    }

    public void deleteUsers(int id) {
        user.removeIf(users -> users.getId() == id);
    }
}
