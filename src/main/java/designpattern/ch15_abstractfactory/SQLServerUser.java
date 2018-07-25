package designpattern.ch15_abstractfactory;

/**
 * Created by song on 2018/7/25.
 */
public class SQLServerUser extends AbstractUser {
    @Override
    public void insert(UserInfo userInfo) {
        System.out.println("SQLServerUser 中insert UserInfo");
    }

    @Override
    public void getUser(int i) {
        System.out.println("SQLServerUser中获取User");
    }
}
