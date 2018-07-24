package designpattern.ch06_decorator;

/**
 * Created by song on 2018/7/19.
 */
public class ConcreteDecoratorA extends  Decorator{

    private String addState;

    public void operation(){
        super.operation();
        addState = "New State";
        System.out.println(" ConcreteDecoratorA operation.");
    }
}
