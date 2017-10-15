package homework.oop;

import java.util.HashMap;

/**
 * Created by Владислав on 14.10.2017.
 */
public class Group<T extends Number> {
    public HashMap<Student,T> members;
    Subject subject;

    public Group(Subject subject){
        members = new HashMap<Student, T>();
        this.subject = subject;
    }

    public void addMember(Student student, T number){
        members.put(student, number);
    }

    public T getStudentMark(Student student){
        return members.get(student);
    }
}
