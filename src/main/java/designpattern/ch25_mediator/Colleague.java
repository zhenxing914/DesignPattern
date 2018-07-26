package designpattern.ch25_mediator;

/**
 * Created by song on 2018/7/26.
 */
public abstract  class Colleague {

   protected   Mediator mediator ;

   public Colleague(Mediator mediator){
       this.mediator = mediator;
   }

   abstract void send(String msg);

   abstract void notifyMsg(String msg);

}
