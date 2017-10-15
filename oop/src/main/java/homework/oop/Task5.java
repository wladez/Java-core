package homework.oop;

import java.util.ArrayList;

/**
 * Created by Владислав on 14.10.2017.
 */
public class Task5 {
    public static void main(String[] args) {
        ArrayList<Group> groupList = new ArrayList<Group>();
        Group<Integer> java = new Group<Integer>(Subject.JAVA);
        Group<Double> javaScript = new Group<Double>(Subject.JAVASCRIPT);
        Student s1 = new Student("Vasya");
        Student s2 = new Student("Petya");
        java.addMember(s1, 4);
        java.addMember(s2, 5);
        javaScript.addMember(s1, 4.5);
        javaScript.addMember(s2, 3.8);
        groupList.add(java);
        groupList.add(javaScript);
        for (Group listElem: groupList) {
            if(null == listElem.getStudentMark(s1)){
                System.out.println(s1 + " has no mark in group for " + listElem.subject);
            }
            else {
                System.out.println(s1 + " in group for " + listElem.subject + " has mark " + listElem.getStudentMark(s1));
            }
        }
    }
}
