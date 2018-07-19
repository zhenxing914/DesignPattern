package designpattern.ch10_TemplateMethod;

/**
 * Created by song on 2018/7/19.
 */
public abstract  class AbstractClass {

    public abstract  void primitiveOperation1();
    public abstract  void primitiveOperation2();

    public void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
        System.out.println("templateMethod is run.");
    }
}
