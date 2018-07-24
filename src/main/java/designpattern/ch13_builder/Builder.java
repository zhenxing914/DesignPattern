package designpattern.ch13_builder;

/**
 * Created by song on 2018/7/24.
 */
public abstract class Builder {

    public abstract  void buildPartA();

    public abstract void  buildPartB();

    public abstract Product getResult();

}
