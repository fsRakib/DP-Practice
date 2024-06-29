package Structural.Composite;

//leaf component
public class FinancialDept implements Department {
    private Integer id;
    private String name;

    public FinancialDept(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void printDeptName() {
        System.out.println(getClass().getSimpleName());

    }

}
