package Entites;

import java.util.ArrayList;
import java.util.List;

public class Department  extends ParentEntity {
    public List<Course> getOfferedCourses() {

        return offeredCourses;
    }
    public void setOfferedCourses(List<Course> offeredCourses) {

        this.offeredCourses = offeredCourses;
    }

    List<Course> offeredCourses = new ArrayList<>();

}
