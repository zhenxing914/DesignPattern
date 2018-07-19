package designpattern.ch07_decorator;

/**
 * Created by song on 2018/7/19.
 */
public class Decorator extends Component {

    private  Component component;

    public void setComponent(Component component){
        this.component = component;
    }
    @Override
    public void operation() {
        if(component!= null){
            component.operation();
        }
    }
}
