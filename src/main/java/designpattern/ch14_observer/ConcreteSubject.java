package designpattern.ch14_observer;

/**
 * Created by song on 2018/7/24.
 */
public class ConcreteSubject extends Subject {

    private String subjectState ;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
