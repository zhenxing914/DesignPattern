package designpattern.ch08_factorymethod;

/**
 * Created by song on 2018/7/19.
 */
public abstract  class Operation {

    double num1;
    double num2;

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public  abstract double getResult();

}
