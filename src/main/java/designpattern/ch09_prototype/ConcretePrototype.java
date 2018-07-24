package designpattern.ch09_prototype;

/**
 * 浅拷贝例子
 *
 * Created by song on 2018/7/23.
 */
public class ConcretePrototype implements Cloneable {
    private int id ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        return super.clone();

    }

}
