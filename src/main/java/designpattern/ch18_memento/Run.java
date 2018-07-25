package designpattern.ch18_memento;

/**
 * Created by song on 2018/7/25.
 */
public class Run {


    public static void main(String[] args) {


        Originator originator = new Originator();
        originator.setState("on");
        originator.show();

        CareTaker careTaker = new CareTaker();
        careTaker.setMemento(originator.createState());

        originator.setState("off");
        originator.show();

        originator.setMemento(careTaker.getMemento());
        originator.show();

    }
}
