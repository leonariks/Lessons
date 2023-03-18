package com.example.users.repositories;

import com.example.users.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    //Метод поиска по емайл
    List<User> findByEmail(String email);

    List<User> findByPhoneNumber(String phoneNumber);

    List<User> findByLastNameOrderByAge(String lastName);

    List<User> findByLastNameStartingWith(String startingWith);

    @Query(value = "select * from user_site where user_site .last_name = ?1 order by age desc ", nativeQuery = true)
    List<User> findByLastNameOrderByAgeDesc(String lastName);
}
