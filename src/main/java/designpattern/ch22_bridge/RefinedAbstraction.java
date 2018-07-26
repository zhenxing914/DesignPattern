package designpattern.ch22_bridge;

/**
 * Created by song on 2018/7/26.
 */
public class RefinedAbstraction extends Abstraction {


    @Override
    public void operation(){
        System.out.println("RefinedAbstraction is run .");
        this.implementor.operation();
    }

}
