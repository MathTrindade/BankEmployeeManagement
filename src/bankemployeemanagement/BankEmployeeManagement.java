/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package bankemployeemanagement;

import bankemployeemanagement.model.Employee;
import bankemployeemanagement.model.EmployeeModel;

public class BankEmployeeManagement {

    public static void main(String[] args) {

        EmployeeModel model = new EmployeeModel();

        // read the employee file
        if (model.readFile("data/Applicants_Form.txt")) {

            System.out.println("File loaded successfully");

            // show all employees
            for (Employee employee : model.getEmployees()) {
                System.out.println(employee);
            }

            // show total of employees
            System.out.println("Total employees: "
                    + model.getEmployees().size());

        } else {
            System.out.println("File not found");
        }
    }
}
