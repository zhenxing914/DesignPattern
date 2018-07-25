package designpattern.ch20_iterator;

/**
 * Created by song on 2018/7/25.
 */
public class ConcreteIterator extends Iterator {

    private ConcreteAggregate concreteAggregate;
    int current = -1;

    public ConcreteIterator(ConcreteAggregate concreteAggregate){

        this.concreteAggregate = concreteAggregate;

    }

    @Override
    public Object first() {
        return  concreteAggregate.itemList.get(0);
    }

    @Override
    public Object next() {
        current++;
        Object result = null;
        if(current < concreteAggregate.itemList.size()) {
           result =  concreteAggregate.itemList.get(current);
        }
        return  result;
    }

    @Override
    public boolean hasNext() {
        if(current < concreteAggregate.itemList.size()-1)
        {
            return  false;
        }
        else {
            return true;
        }
    }

    @Override
    public String currentItem() {
        return concreteAggregate.itemList.get(current);
    }
}
