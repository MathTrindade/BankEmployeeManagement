/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankemployeemanagement.model;
import java.util.List;
/**
 *
 * @author mathe
 */

public class EmployeeSearch {

    // search employee by name
    public Employee binarySearch(List<Employee> employees,
            String name, int left, int right) {

        // employee not found
        if (left > right) {
            return null;
        }

        // find the middle position
        int middle = left + (right - left) / 2;

        Employee employee = employees.get(middle);

        int result = employee.getName().compareToIgnoreCase(name);

        // employee found
        if (result == 0) {
            return employee;
        }

        // search the left side
        if (result > 0) {
            return binarySearch(employees, name, left, middle - 1);
        }

        // search the right side
        return binarySearch(employees, name, middle + 1, right);
    }
}