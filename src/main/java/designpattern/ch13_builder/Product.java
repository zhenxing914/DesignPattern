package designpattern.ch13_builder;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by song on 2018/7/24.
 */
public class Product {
    List<String> parts = new LinkedList<String>();

    public void addPart(String part){
        parts.add(part);
    }

    public void show(){

        for(String part : parts){
            System.out.println("Product part : " +part);
        }
    }
}
