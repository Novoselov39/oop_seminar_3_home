package oop.seminar_3.oop_seminar_3_home;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
        
    public static void main(String[] args) {
        List<Student> studentList1 = new ArrayList<Student>();  
        List<Student> studentList2 = new ArrayList<Student>();   
        List<Student> studentList3 = new ArrayList<Student>();                       
        Student student1 = new Student("1","1","1", "1.1.1",  111L);
        Student student2 = new Student("2","2","2", "2.1.1",  112L);   
        Student student3 = new Student("5","5","5", "3.1.1",  113L);
        Student student4 = new Student("3","3","3", "4.1.1",  114L);
        Student student5 = new Student("4","4","4", "5.1.1",  115L);

        Student student6 = new Student("6","1","1", "1.1.1",  1111L);
        Student student7 = new Student("7","2","2", "2.1.1",  1121L);   
        Student student8 = new Student("8","5","5", "3.1.1",  1131L);
        Student student9 = new Student("9","3","3", "4.1.1",  1141L);
        Student student10 = new Student("10","4","4", "5.1.1",  1151L);

        Student student11 = new Student("11","1","1", "1.1.1",  1112L);
        Student student12 = new Student("12","2","2", "2.1.1",  1122L);   
        Student student13 = new Student("15","5","5", "3.1.1",  1132L);
        Student student14 = new Student("13","3","3", "4.1.1",  1142L);
        Student student15 = new Student("14","4","4", "5.1.1",  1152L);
        Teacher teacher1 = new Teacher("ivanova", "11", "11", "6.1.1", 13L);
        Teacher teacher2 = new Teacher("petrova", "11", "11", "6.1.1", 143L);
        studentList1.add(student2);
        studentList1.add(student1);
        studentList1.add(student3);
        studentList1.add(student4);
        studentList1.add(student5);

        studentList2.add(student6);
        studentList2.add(student7);
        studentList2.add(student8);
        studentList2.add(student9);
        studentList2.add(student10);

        studentList3.add(student11);
        studentList3.add(student12);
        studentList3.add(student13);
        studentList3.add(student14);
        studentList3.add(student15);
        StudentGroup studentGroup1 = new StudentGroup("AC 1",100L,studentList1, teacher1);
        StudentGroup studentGroup2 = new StudentGroup("AC 2",101L,studentList2, teacher2);
        StudentGroup studentGroup3 = new StudentGroup("AC 3", 102L,studentList3, teacher2);
        List<StudentGroup> studenGrouptList = new ArrayList<StudentGroup>(); 
        studenGrouptList.add(studentGroup2);
        studenGrouptList.add(studentGroup1);
        studenGrouptList.add(studentGroup3);
        //tet1(studentList1, teacher);
        //test3(studentList1, studentGroup1);
        test4(studenGrouptList);
        
    }
    public static  void tet1(List<Student> studentList, Teacher teacher) {

        StudentGroupIterator sgi= new StudentGroupIterator(studentList);
        //StudentGroup studentGroup = new StudentGroup(studentList, teacher);

        // sgi.next();
        // sgi.remove();
         sgi.zeroCounter();

        // while (sgi.hasNext()) {
        //     System.out.println(sgi.next());
            
        // }
        // for (Student i :studentGroup ) {
        //     System.out.println(i);
            
        // }
    }
    public static void test3(List<Student> studentList,StudentGroup studentGroup){
        for (Student i :studentGroup ) {
            System.out.println(i);
            
        }
        Collections.sort(studentList);
        for (Student i :studentGroup ) {
            System.out.println(i);
            
        }
    }
    
    public static void test4(List<StudentGroup> studenGrouptList) {
        
        for (StudentGroup i :studenGrouptList ) {
            System.out.println(i);
            
         }
        studenGrouptList.sort(new GroupComparator());
        System.out.println("--------------------");
        for (StudentGroup i :studenGrouptList ) {
            System.out.println(i);
            
         }
        

    }
}
