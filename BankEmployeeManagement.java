/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


package bankemployeemanagement;

import bankemployeemanagement.controller.EmployeeController;
import bankemployeemanagement.view.EmployeeView;

public class BankEmployeeManagement {

    public static void main(String[] args) {

        EmployeeController controller = new EmployeeController();
        EmployeeView view = new EmployeeView();

        // load the employee file
        if (controller.loadEmployees()) {

            view.showMessage("File loaded successfully");

            // sort and show employees
            controller.sortEmployees();
            view.showEmployees(controller.getModel().getEmployees());

            // build and show the tree
            controller.buildTree();
            view.showTree(controller.getTree());

            // search for an existing employee
            view.showMessage("\nSearch test 1:");
            view.showSearchResult(controller.searchEmployee("Mia Clark"));

            // search for an employee that does not exist
            view.showMessage("\nSearch test 2:");
            view.showSearchResult(controller.searchEmployee("John Unknown"));

        } else {
            view.showMessage("File not found");
        }
    }
}