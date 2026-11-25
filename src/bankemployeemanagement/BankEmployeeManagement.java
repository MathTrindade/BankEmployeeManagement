/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


package bankemployeemanagement;

import bankemployeemanagement.model.EmployeeModel;
import bankemployeemanagement.model.EmployeeSorter;

public class BankEmployeeManagement {

    public static void main(String[] args) {

        EmployeeModel model = new EmployeeModel();
        EmployeeSorter sorter = new EmployeeSorter();

        // read the employee file
        if (model.readFile("data/Applicants_Form.txt")) {

            System.out.println("File loaded successfully");

            // sort employees by name
            sorter.mergeSort(model.getEmployees());

            System.out.println("\nFirst 20 employees:");

            // show only the first 20 names
            for (int i = 0; i < 20 &&
                    i < model.getEmployees().size(); i++) {

                System.out.println((i + 1) + ". "
                        + model.getEmployees().get(i).getName());
            }

            System.out.println("\nTotal employees: "
                    + model.getEmployees().size());

        } else {
            System.out.println("File not found");
        }
    }
}
