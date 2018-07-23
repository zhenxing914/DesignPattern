package designpattern.ch8_factorymethod;

/**
 * Created by song on 2018/7/23.
 */
public class Run {
    public static void main(String[] args) {

        Operation operation = new AddFactory().createOperation();
        operation.setNum1(1);
        operation.setNum2(2);
        double result = operation.getResult();

        System.out.println("result "+result);

    }
}
