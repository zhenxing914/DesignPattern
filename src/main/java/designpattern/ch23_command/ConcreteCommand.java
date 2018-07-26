package designpattern.ch23_command;

/**
 * Created by song on 2018/7/26.
 */
public class ConcreteCommand extends Command{

    private  Receiver receiver = null ;

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {

        receiver.action();
    }
}
