package designpattern.ch22_bridge;

/**
 * Created by song on 2018/7/26.
 */
public class Abstraction {

    protected   Implementor implementor;

    public void setImplementor(Implementor implementor){

        this.implementor = implementor;
    }

    public void operation(){
        implementor.operation();
    }
}
