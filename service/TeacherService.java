package oop.seminar_3.oop_seminar_3_home.service;

import java.util.List;
import oop.seminar_3.oop_seminar_3_home.Teacher;

public class TeacherService implements IUserService<Teacher> {
    private List<Teacher> teachers;

    @Override
    public void create(String firstName, String secondName, String patronymic, String dateOfBirth) {
        Long countMaxId = 0L;
        for (Teacher teacher: teachers){
                if (teacher.getTeacherId() > countMaxId){
                    countMaxId = teacher.getTeacherId();
            }
        }
        countMaxId++;
        Teacher teacher = new Teacher(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        teachers.add(teacher);
        
    }

    @Override
    public List<Teacher> getAll() {
        
        return teachers;
    }
    
    
}
