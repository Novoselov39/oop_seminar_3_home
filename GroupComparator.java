package oop.seminar_3.oop_seminar_3_home;

import java.util.Comparator;

public class GroupComparator implements Comparator<StudentGroup> {

    @Override
    public int compare(StudentGroup o1, StudentGroup o2) { 
        int resultOfComparing = o1.getNameGroup().compareTo(o2.getNameGroup());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getTeacher().getFirstName().compareTo(o2.getTeacher().getFirstName());
            
        } else {
            return resultOfComparing;
        }
        return resultOfComparing;
    }

    
}
