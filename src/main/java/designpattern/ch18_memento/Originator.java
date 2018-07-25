package designpattern.ch18_memento;

/**
 * Created by song on 2018/7/25.
 */
public class Originator {

    private String state ;

    public String getState() {
        return state;
    }

    public Memento createState(){
        return  new Memento(state);
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setMemento(Memento memento){

        this.state = memento.getState();

    }


    public void show(){
        System.out.println("state is :" + state);
    }


}
