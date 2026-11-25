/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


package bankemployeemanagement;

import bankemployeemanagement.model.Employee;
import bankemployeemanagement.model.EmployeeModel;
import bankemployeemanagement.model.EmployeeSorter;
import bankemployeemanagement.model.EmployeeTree;

public class BankEmployeeManagement {

    public static void main(String[] args) {

        EmployeeModel model = new EmployeeModel();
        EmployeeSorter sorter = new EmployeeSorter();
        EmployeeTree tree = new EmployeeTree();

        // read the employee file
        if (model.readFile("data/Applicants_Form.txt")) {

            System.out.println("File loaded successfully");

            // sort employees by name
            sorter.mergeSort(model.getEmployees());

            System.out.println("\nFirst 20 employees:");

            for (int i = 0; i < 20 &&
                    i < model.getEmployees().size(); i++) {

                System.out.println((i + 1) + ". "
                        + model.getEmployees().get(i).getName());
            }

            // add all employees to the tree
            for (Employee employee : model.getEmployees()) {
                tree.insert(employee);
            }

            // show the binary tree
            System.out.println("\nBinary Tree:");
            tree.displayTree();

            // show the total and height
            System.out.println("\nTotal employees: "
                    + tree.getTotal());

            System.out.println("Tree levels: "
                    + tree.getHeight());

        } else {
            System.out.println("File not found");
        }
    }
}
