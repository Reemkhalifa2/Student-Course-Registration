package Behaviour;

import Entites.Course;

public interface DepartmentInterface {
    Boolean addCourse(Course course);
    Boolean removeCourse(Course course);
    Boolean modifyCourse(String courseCode, Course updatedCourse);
}
