package designpattern.ch7_proxy;

/**
 * Created by song on 2018/7/23.
 */
public class Proxy extends Subject {

    Subject subject = null;


    @Override
    public void request() {

        if(subject == null) {
            subject = new RealSubject();
        }

        subject.request();
    }


}
