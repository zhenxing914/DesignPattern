package designpattern.ch20_iterator;

/**
 * Created by song on 2018/7/25.
 */
public class Run {

    public static void main(String[] args) {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        concreteAggregate.itemList.add("第一个元素");
        concreteAggregate.itemList.add("第二个元素");
        concreteAggregate.itemList.add("第三个元素");
        concreteAggregate.itemList.add("第四个元素");

        Iterator iterator = concreteAggregate.createIterator();
        String first = (String)iterator.first();
        System.out.println(first);
        while( !iterator.hasNext())
        {
            System.out.println((String)iterator.next());
        }


    }
}
