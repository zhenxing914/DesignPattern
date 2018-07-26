package designpattern.ch26_flyweight;

/**
 * Created by song on 2018/7/26.
 */
public class Run {

    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight flyweight = flyweightFactory.getFlyweight("X");
        flyweight.operation(1);

        Flyweight flyweight2 = flyweightFactory.getFlyweight("Y");
        flyweight.operation(2);

        UnshareConcreteFlyweight unshareConcreteFlyweight = new UnshareConcreteFlyweight();
        unshareConcreteFlyweight.operation(3);
    }
}

