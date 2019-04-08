package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {

    Integer id;
    Double totalHours =0.0;
    public Student() {
        this(null);
    }

    public Integer getId(){
        return id;
    }

    public Student(Integer id) {
        this.id = id;
    }

    public void learn(Double amountOfHours) {
    totalHours = amountOfHours+ getTotalStudyTime();
    }

    public Double getTotalStudyTime() {
        return totalHours;
    }
}
