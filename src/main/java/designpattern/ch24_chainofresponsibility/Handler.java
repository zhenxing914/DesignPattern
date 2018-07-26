package designpattern.ch24_chainofresponsibility;

/**
 * Created by song on 2018/7/26.
 */
public  abstract  class Handler {

    public Handler successor;

    public  void setSuccessor(Handler successor){
        this.successor = successor;
    }

    public abstract void handleRequest(int request);
}
