package designpattern.ch07_decorator;

/**
 * Created by song on 2018/7/19.
 */
public class ConcreteDecoratorB extends  Decorator{

    private String addState;

    public void operation(){
        super.operation();
        addState = "New State B";
        System.out.println(" ConcreteDecoratorB operation.");
    }
}
