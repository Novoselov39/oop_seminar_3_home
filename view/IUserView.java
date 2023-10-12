package oop.seminar_3.oop_seminar_3_home.view;
import java.util.List;
import oop.seminar_3.oop_seminar_3_home.User;
import oop.seminar_3.oop_seminar_3_home.Student;

public interface IUserView<T extends User> {

    void sendOnConsole(List<T> list);
    
}
