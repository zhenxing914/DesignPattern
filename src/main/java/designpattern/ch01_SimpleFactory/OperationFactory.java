package designpattern.ch01_SimpleFactory;

/**
 * Created by song on 2018/7/19.
 */
public class OperationFactory {

    public static Operation createOperation(String operation){

        Operation oper  = null;

        switch (operation){
            case "+" :
                oper = new OperationAdd();
                break;
            case "-" :
                oper = new OperationSub();
                break;

        }
        return oper;
    }
}
