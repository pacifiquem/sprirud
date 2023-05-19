package learning.mpac.sprirud.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private int studentId;
    private String studentName;
    @Autowired
    @Qualifier("studentDepartment")
    private Department studentDept;

    public Student() {
        System.out.println("Object of Student class created.");
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Department getStudentDept() {
        return studentDept;
    }

    public void setStudentDept(String deptName) {
        Department dept = new Department();
        dept.setDepartmentName(deptName);
        this.studentDept = dept;
    }

    public void showStudDepartment() {
        this.studentDept.displayDepartmentName();
    }
}

