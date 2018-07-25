package designpattern.ch16_state;

/**
 * Created by song on 2018/7/25.
 */
public class Run {

    public static void main(String[] args) {

        Context context = new Context(new ConcreteState1());
        context.request();
        context.request();
        context.request();
    }
}
