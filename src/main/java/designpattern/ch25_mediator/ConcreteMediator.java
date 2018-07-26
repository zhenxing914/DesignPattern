package designpattern.ch25_mediator;

/**
 * Created by song on 2018/7/26.
 */
public class ConcreteMediator extends Mediator {

    private  ConcreteColleague1 concreteColleague1 ;

    private ConcreteColleague2 concreteColleague2;

    public ConcreteColleague1 getConcreteColleague1() {
        return concreteColleague1;
    }

    public void setConcreteColleague1(ConcreteColleague1 concreteColleague1) {
        this.concreteColleague1 = concreteColleague1;
    }

    public ConcreteColleague2 getConcreteColleague2() {
        return concreteColleague2;
    }

    public void setConcreteColleague2(ConcreteColleague2 concreteColleague2) {
        this.concreteColleague2 = concreteColleague2;
    }

    @Override
    public void send(String msg, Colleague colleage) {
        if(colleage == concreteColleague1)
        {
            concreteColleague2.notifyMsg(msg);
        }
        else {
            concreteColleague1.notifyMsg(msg);
        }
    }
}
