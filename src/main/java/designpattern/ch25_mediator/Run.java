package designpattern.ch25_mediator;

/**
 * Created by song on 2018/7/26.
 */
public class Run {


    public static void main(String[] args) {

        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleague1 concreteColleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 concreteColleague2 = new ConcreteColleague2(mediator);

        mediator.setConcreteColleague1(concreteColleague1);
        mediator.setConcreteColleague2(concreteColleague2);

        concreteColleague1.send("hello , i`m colleague1 .");
        concreteColleague2.send("hello, i`m colleage 2 .");
    }
}
