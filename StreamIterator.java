package oop.seminar_3.oop_seminar_3_home;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {
    private int counter;
    private List<StudentGroup> studentGroup;

    public StreamIterator(List<StudentGroup> studentGroup) {
        counter=0;
        this.studentGroup=studentGroup;
    }

    @Override
    public boolean hasNext() {
        return counter<studentGroup.size();
    }

    @Override
    public StudentGroup next() {
        if(!hasNext())
            return null;
        return studentGroup.get(counter++);
    }
    
    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public List<StudentGroup> getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(List<StudentGroup> studentGroup) {
        this.studentGroup = studentGroup;
    }
    
    

    
}
