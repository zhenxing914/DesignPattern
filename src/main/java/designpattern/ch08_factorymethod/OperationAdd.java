package designpattern.ch08_factorymethod;

/**
 * Created by song on 2018/7/19.
 */
public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        return num1+num2;
    }
}
