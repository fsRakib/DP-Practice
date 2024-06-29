package Structural.Composite;

public class Main {
    public static void main(String[] args) {
        Department salesDept = new SalesDept(1, "Sales Department");
        Department financeDept = new FinancialDept(2, "Financial Department");
        HeadDept headDept = new HeadDept(3, "Head Department");

        headDept.addDept(salesDept);
        headDept.addDept(financeDept);

        headDept.printDeptName();
    }
}
