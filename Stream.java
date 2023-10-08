package oop.seminar_3.oop_seminar_3_home;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {
    private List<StudentGroup> studentGroup;
    private Teacher teacher;
       
    public List<StudentGroup> getStudentGroup() {
        return studentGroup;
    }
    public void setStudentGroup(List<StudentGroup> studentGroup) {
        this.studentGroup = studentGroup;
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public Stream(List<StudentGroup> studentGroup, Teacher teacher) {
        this.studentGroup = studentGroup;
        this.teacher = teacher;
    }
    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this.studentGroup);
    }

    
    
    
}
