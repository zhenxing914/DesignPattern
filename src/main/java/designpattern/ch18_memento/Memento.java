package designpattern.ch18_memento;

/**
 * Created by song on 2018/7/25.
 */
public class Memento {

   private String state ;

    public Memento(String state) {

        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
