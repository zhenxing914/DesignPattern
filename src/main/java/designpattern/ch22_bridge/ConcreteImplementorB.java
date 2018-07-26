package designpattern.ch22_bridge;

/**
 * Created by song on 2018/7/26.
 */
public class ConcreteImplementorB  extends  Implementor{
    @Override
    public void operation() {
        System.out.println("ConcreteImplementB is run .");
    }
}
