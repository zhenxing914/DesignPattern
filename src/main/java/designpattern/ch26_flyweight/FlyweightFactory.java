package designpattern.ch26_flyweight;

import java.util.HashMap;

/**
 * Created by song on 2018/7/26.
 */
public class FlyweightFactory {

    HashMap<String , Flyweight> flyweights = new HashMap<String, Flyweight>();

    public FlyweightFactory(){
        flyweights.put("X",new ConcreteFlyweight());
        flyweights.put("Y", new ConcreteFlyweight());
        flyweights.put("Z", new ConcreteFlyweight());
    }


    public Flyweight getFlyweight(String key){
        return flyweights.get(key);
    }
}
