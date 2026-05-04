package Behaviour;

import Entites.Course;
import Entites.Department;

public interface DepartmentInterface {
    Boolean addDepartment(Department department);
    Boolean addCourse(Course course);
    Boolean removeCourse(Course course);
    Boolean modifyCourse(String courseCode, Course updatedCourse);
}
