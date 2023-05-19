package learning.mpac.sprirud.classes;

import org.springframework.context.annotation.Scope;

@Scope("prototype")
public  class Employee {
    private int empID;
    private String empName;
    private int departmentID;

    public Employee() {
        System.out.println("Object of Employee class created.");
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }
}