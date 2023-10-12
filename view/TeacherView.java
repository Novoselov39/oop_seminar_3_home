package oop.seminar_3.oop_seminar_3_home.view;

import java.util.List;

import oop.seminar_3.oop_seminar_3_home.Teacher;

public class TeacherView implements IUserView<Teacher> {

    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher teacher : list) {
            System.out.println(teacher.toString());
        }
        
    }

   
    
    
}
