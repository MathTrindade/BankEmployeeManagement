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

        } else {
            view.showMessage("File not found");
        }
    }
}