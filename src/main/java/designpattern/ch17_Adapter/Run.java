package designpattern.ch17_Adapter;

/**
 * Created by song on 2018/7/19.
 */
public class Run {

    public static void main(String args[]){
        Target target =new Adapter();
        target.request();
    }
}
