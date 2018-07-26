package designpattern.ch26_flyweight;

/**
 * Created by song on 2018/7/26.
 */
public class ConcreteFlyweight extends Flyweight {
    @Override
    public void operation(int extrinsicState) {
        System.out.println("ConcreteFlyweight run . extrinsic is :" +extrinsicState);
    }
}
