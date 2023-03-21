package com.example.onetoone.repositories;

import com.example.onetoone.models.Passport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassportRepository extends JpaRepository<Passport, Integer> {

    //Найти паспорт по его номеру
    Passport findByNumber(String number);
}
