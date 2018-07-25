package designpattern.ch15_abstractfactory;


/**
 *
 *
 * Created by song on 2018/7/24.
 */
public class AccessUser extends AbstractUser {


    @Override
    public void insert(UserInfo userInfo) {

        System.out.println("AccessUser 中 insert userInfo");

    }

    @Override
    public void getUser(int i) {

    }
}
