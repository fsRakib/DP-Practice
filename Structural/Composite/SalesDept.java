package Structural.Composite;

public class SalesDept implements Department {
    private Integer id;
    private String name;

    public SalesDept(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void printDeptName() {
        System.out.println(getClass().getSimpleName());

    }

}
