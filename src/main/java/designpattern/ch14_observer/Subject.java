package designpattern.ch14_observer;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by song on 2018/7/24.
 */
public class Subject {

    List<Observer> observers  = new LinkedList<Observer>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void delObserver(int i ){
        observers.remove(i);
    }

    public void notifyObeservers(){
        for(Observer observer :observers)
        {
            observer.update();
        }
    }
}
