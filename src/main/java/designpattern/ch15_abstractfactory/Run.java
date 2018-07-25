package designpattern.ch15_abstractfactory;

/**
 * Created by song on 2018/7/25.
 */
public class Run {

    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo();
        DepartmentInfo departmentInfo = new DepartmentInfo();

        Factory factory = new SQLServerFactory();

        AbstractDepartment  department = factory.createDepartment();
        department.insert(departmentInfo);

        AbstractUser user = factory.createUser();
        user.insert(userInfo);
    }
}
