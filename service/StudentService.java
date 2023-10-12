package oop.seminar_3.oop_seminar_3_home.service;

import java.util.List;

import oop.seminar_3.oop_seminar_3_home.Student;

public class StudentService implements IUserService<Student>{
    private List<Student> students;

    @Override
    public void create(String firstName, String secondName, String patronymic, String dateOfBirth) {
        Long countMaxId = 0L;
        for (Student student: students){
                if (student.getStudentId() > countMaxId){
                    countMaxId = student.getStudentId();
            }
        }
        countMaxId++;
        Student student = new Student(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        students.add(student);
        
    }

    @Override
    public List<Student> getAll() {
        
        return students;
    }

    
    
}
