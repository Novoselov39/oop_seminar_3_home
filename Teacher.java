package oop.seminar_3.oop_seminar_3_home;

import java.time.LocalDate;

public class Teacher extends User {
    private Long teacherId;

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public Teacher(String firstName, String secondName, String patronymic, String dateOfBirth, Long teacherId) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher [teacherId=" + teacherId + 
                "firstName='" + super.getFirstName()+ '\'' +
               ", secondName='" + super.getSecondName() + '\'' +
               ", patronymic='" + super.getPatronymic() + '\'' +
               ", dateOfBirth=" + super.getDateOfBirth() +
               "]";
    }
    
    
}
