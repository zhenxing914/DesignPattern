package designpattern.ch18_memento;

/**
 * Created by song on 2018/7/25.
 */
public class CareTaker {

    private  Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
