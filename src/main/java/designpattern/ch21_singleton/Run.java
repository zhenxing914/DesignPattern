package designpattern.ch21_singleton;

/**
 * Created by song on 2018/7/25.
 */
public class Run {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if(singleton1 == singleton2){
            System.out.println("创建的是同一个对象。");
        }

    }
}
