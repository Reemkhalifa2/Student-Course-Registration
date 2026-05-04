package Entites;

import java.util.List;

public class Student extends ParentEntity{

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    private String Department;
    private String studentId;
    private List<Course> registeredCourses;

}
