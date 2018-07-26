package designpattern.ch22_bridge;

/**
 * Created by song on 2018/7/26.
 */
public class Run {

    public static void main(String[] args) {

        Implementor implementor = new ConcreteImplementorA();

        Abstraction abstraction = new RefinedAbstraction();

        abstraction.setImplementor(implementor);
        abstraction.operation();

        implementor = new ConcreteImplementorB();
        abstraction.setImplementor(implementor);
        abstraction.operation();

    }
}
