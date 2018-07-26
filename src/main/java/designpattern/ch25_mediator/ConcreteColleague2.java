package designpattern.ch25_mediator;

/**
 * Created by song on 2018/7/26.
 */
public class ConcreteColleague2 extends  Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    void send(String msg) {
        this.mediator.send(msg,this);
    }

    @Override
    void notifyMsg(String msg) {

        System.out.println("ConcreteColleague receive msg is : " + msg );

    }
}
