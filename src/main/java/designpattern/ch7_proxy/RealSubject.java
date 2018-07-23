package designpattern.ch7_proxy;

/**
 * Created by song on 2018/7/23.
 */
public class RealSubject extends Subject {
    @Override
    public void request() {
        System.out.println("RealSubject run .");
    }
}
