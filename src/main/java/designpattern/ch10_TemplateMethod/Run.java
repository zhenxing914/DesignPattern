package designpattern.ch10_TemplateMethod;

/**
 * Created by song on 2018/7/19.
 */
public class Run {

    public static void main(String[] args) {
        AbstractClass c;
        c =new ConcreteClassA();
        c.templateMethod();

        c =new ConcreteClassB();
        c.templateMethod();
    }
}
