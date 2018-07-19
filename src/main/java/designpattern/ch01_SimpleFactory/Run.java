package designpattern.ch01_SimpleFactory;

/**
 * Created by song on 2018/7/19.
 */
public class Run {
    public static void main(String[] args) {

        Operation operation = null;

        operation = OperationFactory.createOperation("+");
        operation.num1= 1;
        operation.num2 = 2;
        System.out.println("result : "+ operation.getResult());
    }
}
