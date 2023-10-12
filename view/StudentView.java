package oop.seminar_3.oop_seminar_3_home.view;

import java.util.List;

import oop.seminar_3.oop_seminar_3_home.Student;

public class StudentView implements IUserView<Student> {

    @Override
    public void sendOnConsole(List<Student> list) {
        for (Student student : list) {
            System.out.println(student.toString());
        }
      
    }

  
    
    
}
