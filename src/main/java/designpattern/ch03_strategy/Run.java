package designpattern.ch03_strategy;

/**
 * Created by song on 2018/7/23.
 */
public class Run {

    public static void main(String[] args) {

        Context context ;

        context = new Context(new ConcreteStrategyA());
        context.contextInterface();

        context = new Context(new ConcreteStrategyB());
        context.contextInterface();
    }
}
