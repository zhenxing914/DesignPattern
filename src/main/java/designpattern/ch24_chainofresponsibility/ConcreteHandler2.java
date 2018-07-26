package designpattern.ch24_chainofresponsibility;

/**
 * Created by song on 2018/7/26.
 */
public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(int request) {

        if(request>10 && request<20 ){
            System.out.println("ConcreteHandler2 is process.");
        }
        else
        {
            successor.handleRequest(request);
        }
    }
}
