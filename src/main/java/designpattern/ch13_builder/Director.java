package designpattern.ch13_builder;

/**
 * Created by song on 2018/7/24.
 */
public class Director {

    public void contruct(Builder builder){
        builder.buildPartA();
        builder.buildPartB();
    }
}
