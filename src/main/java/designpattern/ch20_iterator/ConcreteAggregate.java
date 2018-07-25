package designpattern.ch20_iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by song on 2018/7/25.
 */
public class ConcreteAggregate  extends  Aggregate
{
    public List<String> itemList = new ArrayList<String>();

    @Override
    public Iterator createIterator() {
        return  new ConcreteIterator(this);
    }


}
