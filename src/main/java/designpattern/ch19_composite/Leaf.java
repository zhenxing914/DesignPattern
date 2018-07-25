package designpattern.ch19_composite;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by song on 2018/7/25.
 */
public class Leaf extends Component {

    public Leaf(String name ){
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("Leaf cant add component");
    }

    @Override
    public void remove(Component component) {

        System.out.println("leaf can`t remove component .");
    }

    @Override
    public void display(int depth) {

        System.out.println(StringUtils.repeat('-',depth)+ name );

    }
}
