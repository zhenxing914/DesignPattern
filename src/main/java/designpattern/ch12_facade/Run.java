package designpattern.ch12_facade;

/**
 * Created by song on 2018/7/24.
 */
public class Run {

    public static void main(String[] args) {

        Facade facade = new Facade();

        facade.methodA();

        facade.methodB();
    }
}
