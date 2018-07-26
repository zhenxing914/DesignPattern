package designpattern.ch25_mediator;

/**
 * Created by song on 2018/7/26.
 */
public class ConcreteColleague1 extends  Colleague{


    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    void send(String msg ) {
        mediator.send(msg ,this);
    }

    @Override
    void notifyMsg(String msg) {
        System.out.println("ConcreteColleague receive msg is :" + msg);
    }
}
