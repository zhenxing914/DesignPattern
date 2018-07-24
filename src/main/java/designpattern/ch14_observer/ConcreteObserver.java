package designpattern.ch14_observer;

/**
 * Created by song on 2018/7/24.
 */
public class ConcreteObserver extends Observer {

    ConcreteSubject concreteSubject ;
    String name ;

    String subjectState;

    public ConcreteObserver(ConcreteSubject subject,String name ){
        this.concreteSubject = subject;
        this.name = name;
    }

    @Override
    public void update() {
        this.subjectState = concreteSubject.getSubjectState();

        System.out.println("Observer "+ name +"  subjectState : " +subjectState);
    }


}
