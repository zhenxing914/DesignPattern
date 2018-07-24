package designpattern.ch13_builder;

/**
 * Created by song on 2018/7/24.
 */
public class ConcreteBuilder1 extends Builder {
    Product product = new Product();

    @Override
    public void buildPartA() {
        product.addPart("组件x");
    }

    @Override
    public void buildPartB() {
        product.addPart("组件y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
