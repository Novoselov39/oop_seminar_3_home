package oop.seminar_3.oop_seminar_3_home.Controller;

import oop.seminar_3.oop_seminar_3_home.Teacher;
import oop.seminar_3.oop_seminar_3_home.service.TeacherService;
import oop.seminar_3.oop_seminar_3_home.view.TeacherView;

public class TeacherController implements IUserController<Teacher> {
    TeacherService teacherService = new TeacherService();
    TeacherView teacherView = new TeacherView();
    
    @Override
    public void create(String firstName, String secondName, String patronymic, String dateOfBirth) {
        teacherService.create(firstName, secondName, patronymic, dateOfBirth);
        teacherView.sendOnConsole(teacherService.getAll());
        
        
    }
    
    
}
