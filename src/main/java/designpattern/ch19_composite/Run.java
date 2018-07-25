package designpattern.ch19_composite;

/**
 * Created by song on 2018/7/25.
 */
public class Run {

    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("A"));
        root.add(new Leaf("B"));

        Composite composite1 = new Composite("X");
        composite1.add(new Leaf("XA"));
        composite1.add(new Leaf("XB"));
        root.add(composite1);

        Composite composite2 = new Composite("XY");
        composite2.add(new Leaf("XYA"));
        composite2.add(new Leaf("XYB"));
        composite1.add(composite2);


        Leaf leaf1 = new Leaf("C");
        Leaf leaf2 = new Leaf("D");
        root.add(leaf1);
        root.add(leaf2);

        root.remove(leaf2);

        root.display(1);


    }



}
