package oop.seminar_3.oop_seminar_3_home;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup>{
    
    
    

    private List<Student> studentlist;
    private Teacher teacher;
    private String nameGroup;
    private long groupId;
    public StudentGroup( String nameGroup,Long groupId, List<Student> studentlist, Teacher teacher) {
        this.studentlist = studentlist;
        this.teacher = teacher;
        this.nameGroup = nameGroup;
        this.groupId = groupId;
    }
    
    public List<Student> getStudentlist() {
        return studentlist;
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public void setStudentlist(List<Student> studentlist) {
        this.studentlist = studentlist;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getnameGroup() {
        return nameGroup;
    }

    public void setNameStream(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    

    @Override
    public StudentGroupIterator iterator() {
        return new StudentGroupIterator(this.studentlist);
    }

    

    @Override
    public String toString() {
        return "StudentGroup [groupId="+groupId+
                            " nameGroup=" + nameGroup +                            
                            " Teacher="+teacher.getFirstName()+"]";
    }
    @Override
    public int compareTo(StudentGroup o) {
        return this.nameGroup.compareTo(o.nameGroup);
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }




}
