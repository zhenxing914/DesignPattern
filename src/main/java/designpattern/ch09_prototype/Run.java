package designpattern.ch09_prototype;

/**
 * Created by song on 2018/7/24.
 */
public class Run {

    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePrototype c1 = new ConcretePrototype();
        c1.setId(1);

        ConcretePrototype c2 = (ConcretePrototype)c1.clone();
        System.out.println(c2.getId());

    }
}
