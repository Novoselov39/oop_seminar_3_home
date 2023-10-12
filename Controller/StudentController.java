package oop.seminar_3.oop_seminar_3_home.Controller;

import oop.seminar_3.oop_seminar_3_home.Student;
import oop.seminar_3.oop_seminar_3_home.service.StudentService;
import oop.seminar_3.oop_seminar_3_home.view.StudentView;

public class StudentController implements IUserController<Student> {

    private StudentService studentService = new StudentService();
    private StudentView studentView = new StudentView();

    @Override
    public void create(String firstName, String secondName, String patronymic, String dateOfBirth) {
        studentService.create(firstName, secondName, patronymic, dateOfBirth);
        studentView.sendOnConsole(studentService.getAll());
        
        
    }
    
    
}
