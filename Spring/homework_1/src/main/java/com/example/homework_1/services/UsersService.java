package com.example.homework_1.services;

import com.example.homework_1.models.Users;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repositories.UsersRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class UsersService {

    private UsersRepository usersRepository;

    //Метод позволяет вернуть всех пользователей
    public List<User> getAllUser() {
        return usersRepository.findAll();
    }

    //Метод позволяет вернуть всех пользователей по id
    public User getUserId(int id) {
        Optional<User> optionalUsers = usersRepository.findById(id);
        return optionalUsers.orElse(null);
    }

    //Метод позволяет добавить пользователя в таблицу user_site
    @Transactional
    public void newUsers(User user) {
        usersRepository.save(user);
    }

    //Метод позволяет обновить данные пользователя
    @Transactional
    public void editUser(int id, Users users){
        users.setId(id);
        usersRepository.save(user);
    }
}
