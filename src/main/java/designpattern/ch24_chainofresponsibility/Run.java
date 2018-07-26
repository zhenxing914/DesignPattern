package designpattern.ch24_chainofresponsibility;

/**
 * Created by song on 2018/7/26.
 */
public class Run {

    public static void main(String[] args) {
        ConcreteHandler1 concreteHandler1 = new ConcreteHandler1();
        ConcreteHandler2 concreteHandler2 = new ConcreteHandler2();
        ConcreteHandler3 concreteHandler3 = new ConcreteHandler3();

        concreteHandler1.setSuccessor(concreteHandler2);
        concreteHandler2.setSuccessor(concreteHandler3);

        int[] requests = {9 ,23, 22, 9,7 ,12};

        for (int request :requests) {
            concreteHandler1.handleRequest(request);
        }
    }
}
