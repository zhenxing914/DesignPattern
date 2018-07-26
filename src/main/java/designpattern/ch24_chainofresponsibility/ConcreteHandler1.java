package designpattern.ch24_chainofresponsibility;

/**
 * Created by song on 2018/7/26.
 */
 public class ConcreteHandler1  extends  Handler{
    @Override
    public void handleRequest(int request) {

        if(request>0 && request< 10 ){
            System.out.println("ConcreteHandler1 is process .");
        }
        else{
            successor.handleRequest(request);
        }
    }
}
