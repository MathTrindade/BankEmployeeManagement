/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankemployeemanagement.model;

/**
 *
 * @author mathe
 */
public class Employee {
    
    private String name;
    private String managerType;
    private String department;

    // create the employee with the information
    public Employee(String name, String managerType, String department) {
        this.name = name;
        this.managerType = managerType;
        this.department = department;
    }

    // get the name
    public String getName() {
        return name;
    }

    // get the manager type
    public String getManagerType() {
        return managerType;
    }

    // get the department
    public String getDepartment() {
        return department;
    }

    // show the employee information
    public String toString() {
        return name + " | " + managerType + " | " + department;
    }
}
    

