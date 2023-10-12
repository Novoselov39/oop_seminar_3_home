package oop.seminar_3.oop_seminar_3_home.Controller;

import oop.seminar_3.oop_seminar_3_home.User;

import java.time.LocalDate;

public interface UserController<T extends User>{
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}