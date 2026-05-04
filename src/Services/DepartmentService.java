package Services;

import Behaviour.DepartmentInterface;
import Entites.Course;
import Entites.Department;
import Utils.Constants;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepartmentService implements DepartmentInterface {
    static Scanner scanner = new Scanner(System.in);
    List<Department> departmentsList = new ArrayList<>();
    Department department = new Department();


    @Override
    public Boolean addDepartment(Department department) {
        System.out.println("** ** Add new Department ** **");
        for (Department d : departmentsList) {
            if (d.getName().equalsIgnoreCase(department.getName())) {
                System.out.println(Constants.DEPARTMENT_ALREADY_EXISTS);
                return false;
            }
        }
        departmentsList.add(department);
        System.out.println("Department added successfully!");
        return true;

    }

    public List<Department> addNewDepartments() {
        while (true) {

            System.out.println("Enter Department Name:");
            String name = scanner.nextLine();

            Department department = new Department();
            department.setName(name);

            addDepartment(department);

            System.out.println(Constants.INPUT_EXIT_CONTINUE_MESSAGE_DEPARTMENTS);

            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
        }

        return departmentsList;
    }





    @Override
    public Boolean addCourse(Course course) {

        return null;
    }

    @Override
    public Boolean removeCourse(Course course) {
        return null;
    }

    @Override
    public Boolean modifyCourse(String courseCode, Course updatedCourse) {
        return null;
    }

    @Override
    public void displayDepartment() {
        System.out.println("Department Id: " + department.getId());
        System.out.println("Department Name: " + department.getName());


    }

    @Override
    public void displayCourses() {

    }
}
