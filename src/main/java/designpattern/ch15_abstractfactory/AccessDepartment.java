package designpattern.ch15_abstractfactory;

/**
 * Created by song on 2018/7/24.
 */
public class AccessDepartment  extends AbstractDepartment{

    @Override
    void insert(DepartmentInfo departmentInfo) {
        System.out.println("AccessDepartment 中 insert 一个 department");
    }

    @Override
    void getDepartment(int i) {
        System.out.println("获取index ：" + i+" 的 department 信息");
    }
}
