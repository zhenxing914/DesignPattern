package designpattern.ch23_command;

/**
 * Created by song on 2018/7/26.
 */
public class Invoker {

    Command command = null;

    public Invoker(Command command){
        this.command = command;

    }

    public void executeCommand()
    {
        this.command.execute();
    }
}
