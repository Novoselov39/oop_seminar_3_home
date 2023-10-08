package oop.seminar_3.oop_seminar_3_home;

import java.util.List;

import java.util.Iterator;

public class StudentGroupIterator implements Iterator<Student> {
    private int counter;
    private List<Student> studentList;
    public StudentGroupIterator(List<Student> studentList) {
        this.counter = 0;
        this.studentList = studentList;
    }
    @Override
    public boolean hasNext() {
        return counter < studentList.size();
    }
    @Override
    public Student next() {
        if(!hasNext())
            return null;
        
        return studentList.get(counter++);
    }
    @Override
    public void remove() {
        studentList.remove(counter);
    }
    public void zeroCounter(){
        this.counter=0;
    }
    public int getCounter() {
        return counter;
    }
    public void setCounter(int counter) {
        this.counter = counter;
    }
    public List<Student> getStudentList() {
        return studentList;
    }
    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
    

   
    

    
}
