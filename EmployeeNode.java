/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package bankemployeemanagement.model;

public class EmployeeNode {

    Employee employee;
    EmployeeNode left;
    EmployeeNode right;

    // create a new employee node
    public EmployeeNode(Employee employee) {

        this.employee = employee;
        this.left = null;
        this.right = null;
    }
}
