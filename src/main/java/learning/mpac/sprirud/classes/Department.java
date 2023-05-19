package learning.mpac.sprirud.classes;

import org.springframework.stereotype.Component;

@Component("studentDepartment")
public class Department {
    private int departmentId;
    private String departmentName;
    public Department() {
        System.out.println("Created new department");
    }
    public int getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void displayDepartmentName() {
        System.out.println("My Department is: " + this.departmentName);
    }

}