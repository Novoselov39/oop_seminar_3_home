package oop.seminar_3.oop_seminar_3_home.Controller;

import oop.seminar_3.oop_seminar_3_home.User;

public interface IUserController<T extends User> {

   public void create(String firstName, 
                    String secondName, 
                    String patronymic, 
                    String dateOfBirth);
    
}