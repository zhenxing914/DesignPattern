package designpattern.ch17_Adapter;

/**
 * Created by song on 2018/7/19.
 */
public class Adapter extends  Target{

    Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specialRequest();
    }
}
