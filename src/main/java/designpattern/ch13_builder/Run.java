package designpattern.ch13_builder;

/**
 * Created by song on 2018/7/24.
 */
public class Run {

    public static void main(String[] args) {

        Director director =new Director();

        ConcreteBuilder1 builder1 = new ConcreteBuilder1();
        director.contruct(builder1);
        Product product1 = builder1.getResult();
        product1.show();

        ConcreteBuilder2 builder2 = new ConcreteBuilder2();
        director.contruct(builder2);
        Product product2 = builder2.getResult();
        product2.show();

    }
}
