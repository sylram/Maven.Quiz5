package rocks.zipcode.io.quiz4.collections;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {
    Student student;
    ArrayList<Student> students;

    public void enroll(Student student) {
        if(students!=null){
           students.add(student);
        }else {
            students= new ArrayList<>();
            students.add(student);
        }


    }

    public Boolean isEnrolled(Student student) {
        return students.contains(student);
    }

    public void lecture(double numberOfHours) {
        for(Student s: students){
            s.learn(numberOfHours);
        }
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> map = new LinkedHashMap<>();
        for (Student s : this.students) {
            map.put(s,s.getTotalStudyTime());

        }
        return map;
    }
}
