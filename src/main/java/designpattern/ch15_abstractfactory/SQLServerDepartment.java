package designpattern.ch15_abstractfactory;

/**
 * Created by song on 2018/7/25.
 */
public class SQLServerDepartment extends AbstractDepartment {


    @Override
    void insert(DepartmentInfo departmentInfo) {
        System.out.println("SQLServerDepartment中 insert departmentinfo" );
    }

    @Override
    void getDepartment(int i) {

    }
}
