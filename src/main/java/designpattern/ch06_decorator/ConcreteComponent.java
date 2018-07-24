package designpattern.ch06_decorator;


/**
 * Created by song on 2018/7/19.
 */
public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("Concrete Component operation.");
    }
}
