package designpattern.ch02_strategy;

/**
 * Created by song on 2018/7/23.
 */
public class Context {

    public Strategy strategy ;

    public Context(Strategy strategy){

        this.strategy= strategy;

    }

    public void contextInterface(){

        strategy.strateryInterface();
    }


}
