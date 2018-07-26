package designpattern.ch26_flyweight;

/**
 * Created by song on 2018/7/26.
 */
public class UnshareConcreteFlyweight extends Flyweight {
    @Override
    public void operation(int extrinsicState) {
        System.out.println("UnshareConcreteFlyweight run , extrinsic is :" + extrinsicState );
    }
}
