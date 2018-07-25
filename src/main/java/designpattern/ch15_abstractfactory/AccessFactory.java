package designpattern.ch15_abstractfactory;

/**
 * Created by song on 2018/7/25.
 */
public class AccessFactory extends  Factory {
    @Override
    public AbstractDepartment createDepartment() {
        return new AccessDepartment();
    }

    @Override
    public AbstractUser createUser() {
        return new AccessUser();
    }
}
