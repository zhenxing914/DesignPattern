package designpattern.ch25_mediator;

/**
 * Created by song on 2018/7/26.
 */
public abstract class Mediator {

    public abstract void send(String msg, Colleague colleage);
}
