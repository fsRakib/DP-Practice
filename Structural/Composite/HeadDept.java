package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

//composite part
public class HeadDept implements Department {
    private Integer id;
    private String name;
    private List<Department> childDepartments;

    public HeadDept(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.childDepartments = new ArrayList<>();
    }

    @Override
    public void printDeptName() {
        // TODO Auto-generated method stub

    }

    public void addDept(Department department) {
        childDepartments.add(department);
    }

    public void removeDept(Department department) {
        childDepartments.remove(department);
    }

}
