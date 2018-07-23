package designpattern.ch03_strategy;

import designpattern.ch10_TemplateMethod.ConcreteClassB;

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
