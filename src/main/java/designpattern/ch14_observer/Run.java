package designpattern.ch14_observer;

/**
 * Created by song on 2018/7/24.
 */
public class Run {

    public static void main(String[] args) {

        ConcreteSubject subject = new ConcreteSubject();

        subject.setSubjectState("new state");
        subject.addObserver(new ConcreteObserver(subject,"observer1"));
        subject.addObserver( new ConcreteObserver(subject,"observer2"));

        subject.notifyObeservers();
    }
}
