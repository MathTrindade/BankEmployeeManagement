/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankemployeemanagement.view;

import bankemployeemanagement.model.Employee;
import bankemployeemanagement.model.EmployeeTree;
import java.util.List;

/**
 *
 * @author mathe
 */
public class EmployeeView {

    // show a message
    public void showMessage(String message) {
        System.out.println(message);
    }

    // show the first 20 employees
    public void showEmployees(List<Employee> employees) {

        System.out.println("\nFirst 20 employees:");

        for (int i = 0; i < 20 && i < employees.size(); i++) {

            System.out.println((i + 1) + ". "
                    + employees.get(i).getName());
        }
    }

    // show the binary tree
    public void showTree(EmployeeTree tree) {

        System.out.println("\nBinary Tree:");
        tree.displayTree();

        System.out.println("\nTotal employees: "
                + tree.getTotal());

        System.out.println("Tree levels: "
                + tree.getHeight());
    }
}