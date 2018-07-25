package designpattern.ch19_composite;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;

import java.util.List;

/**
 * Created by song on 2018/7/25.
 */
public class Composite  extends Component{

    List<Component> childList = new ArrayList<Component>();


    public Composite(String name ){
        super(name);
    }


    @Override
    public void add(Component component) {
       childList.add(component);
    }

    @Override
    public void remove(Component component) {

        childList.remove(component);
    }

    @Override
    public void display(int depth) {


        System.out.println(StringUtils.repeat('-',depth) + name);

        for(Component component :childList){

            component.display(depth+2);
        }

    }

}
