package designpattern.ch19_composite;

/**
 * Created by song on 2018/7/25.
 */
public abstract  class Component {

    public  String name ;

    public Component(String name ){
        this.name = name ;
    }

    abstract public void add(Component component);

    abstract public void remove(Component component);

    abstract  public void display(int depth);


}
