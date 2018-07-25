package designpattern.ch16_state;

/**
 * Created by song on 2018/7/25.
 */
public class ConcreteState2 extends  State{
    @Override
    public void handle(Context context) {
        context.state = new ConcreteState1();
    }
}
