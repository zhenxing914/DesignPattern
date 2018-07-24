package designpattern.ch08_factorymethod;

/**
 * Created by song on 2018/7/23.
 */
public class AddFactory implements Factory {
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
