package designpattern.ch16_state;

/**
 * Created by song on 2018/7/25.
 */
public class Context {

    public State state;

    public Context(State  state){
        this.state = state;
    }

    public void request(){

        state.handle(this);
        System.out.println("Context state Type is :" + state.getClass().getName());

    }
}
