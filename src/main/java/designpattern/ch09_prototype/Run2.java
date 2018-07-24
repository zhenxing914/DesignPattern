package designpattern.ch09_prototype;

/**
 * Created by song on 2018/7/24.
 */
public class Run2 {

    public static void main(String[] args) throws CloneNotSupportedException {

        ConcretePrototypeB  concretePrototypeB = new ConcretePrototypeB();
        Detail detail = new Detail();
        detail.setId(1);
        concretePrototypeB.setDetailId(1);
        concretePrototypeB.setId(1);
        concretePrototypeB.display();

        ConcretePrototypeB concretePrototypeBClone = (ConcretePrototypeB) concretePrototypeB.clone();
        concretePrototypeBClone.setId(2);
        concretePrototypeBClone.setDetailId(2);
        concretePrototypeBClone.display();


    }
}
