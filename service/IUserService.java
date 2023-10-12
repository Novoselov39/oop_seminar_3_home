package oop.seminar_3.oop_seminar_3_home.service;

import java.util.List;

public interface IUserService<T> {
    List<T> getAll();
    void create(String firstName, 
    String secondName, 
    String patronymic, 
    String dateOfBirth);
}
