package designpattern.ch20_iterator;

/**
 *
 * Created by song on 2018/7/25.
 */
public abstract  class Iterator {

    public  abstract  Object first();

    public abstract Object  next();

    public abstract boolean hasNext();

    public abstract  String currentItem();


}
