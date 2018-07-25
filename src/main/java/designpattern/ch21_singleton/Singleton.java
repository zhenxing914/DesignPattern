package designpattern.ch21_singleton;

/**
 * Created by song on 2018/7/25.
 */
public class Singleton {

    private static Singleton instance = null;

    private  Singleton(){

    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
