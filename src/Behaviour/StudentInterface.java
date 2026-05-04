package Behaviour;

import Entites.Course;

public interface StudentInterface {
    Boolean registerCourse(Course course);
    Boolean dropCourse(String courseCode, Course course);
}
