package designpattern.ch09_prototype;

/**
 * Created by song on 2018/7/24.
 */
public class Detail implements Cloneable {

    public int id ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
