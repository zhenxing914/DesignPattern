package designpattern.ch13_builder;

/**
 * Created by song on 2018/7/24.
 */
public class ConcreteBuilder2 extends Builder {
    Product product = new Product();

    @Override
    public void buildPartA() {
        product.addPart("组件a");
    }

    @Override
    public void buildPartB() {
        product.addPart("组件b");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
