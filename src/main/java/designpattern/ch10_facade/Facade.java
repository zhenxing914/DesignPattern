package designpattern.ch10_facade;

/**
 * Created by song on 2018/7/24.
 */
public class Facade {
    SubSystemOne subSystemOne ;

    SubSystemTwo subSystemTwo;

    SubSystemThree subSystemThree;


    public Facade(){
        subSystemOne = new SubSystemOne();
        subSystemTwo = new SubSystemTwo();
        subSystemThree = new SubSystemThree();

    }

    public void methodA(){

        subSystemOne.methodOne();
        subSystemTwo.methodTwo();
    }

    public void methodB(){
        subSystemThree.methodThree();
    }
}
