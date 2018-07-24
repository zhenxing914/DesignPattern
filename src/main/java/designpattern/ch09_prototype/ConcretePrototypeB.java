package designpattern.ch09_prototype;



/**
 *
 * 深拷贝例子
 *
 * Created by song on 2018/7/24.
 */
public class ConcretePrototypeB implements Cloneable{

    private int id ;

    public Detail detail  ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Detail getDetail() {
        return detail;
    }

    public void setDetailId(int  detailId)
    {
        this.detail.setId( detailId );
    }

    public ConcretePrototypeB(){
        detail  = new Detail();
    }

    public ConcretePrototypeB(Detail detail){
        try {
            this.detail = (Detail) detail.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }


    public void display(){

        System.out.println("id " + this.getId());
        System.out.println("DetailId " + this.detail.getId());

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        ConcretePrototypeB cloneObject = new ConcretePrototypeB(this.detail);
        cloneObject.setId(this.id);
        return cloneObject;

    }
}
