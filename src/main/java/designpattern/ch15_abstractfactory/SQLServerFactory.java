package designpattern.ch15_abstractfactory;

/**
 * Created by song on 2018/7/25.
 */
public class SQLServerFactory  extends Factory{
    @Override
    public AbstractDepartment createDepartment() {
        return new SQLServerDepartment();
    }

    @Override
    public AbstractUser createUser() {
        return new SQLServerUser();
    }
}
