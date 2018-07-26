package designpattern.ch23_command;

/**
 * Created by song on 2018/7/26.
 */
public class Run {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        Command command = new ConcreteCommand(receiver);

        Invoker invoker = new Invoker(command);
        invoker.executeCommand();
    }
}
