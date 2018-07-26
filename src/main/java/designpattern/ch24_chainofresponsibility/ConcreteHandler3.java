package designpattern.ch24_chainofresponsibility;

/**
 * Created by song on 2018/7/26.
 */
public class ConcreteHandler3 extends Handler {
    @Override
    public void handleRequest(int request) {

        if(request>20 && request<30 ){
            System.out.println("ConcreteHandler3 is process.");
        }
        else
        {
            System.out.println("request 超过30 无法处理。");
        }
    }
}
