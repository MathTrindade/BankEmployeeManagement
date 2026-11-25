/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankemployeemanagement.controller;

import bankemployeemanagement.model.Employee;
import bankemployeemanagement.model.EmployeeModel;
import bankemployeemanagement.model.EmployeeSorter;
import bankemployeemanagement.model.EmployeeTree;
/**
 *
 * @author mathe
 */

public class EmployeeController {

    private EmployeeModel model = new EmployeeModel();
    private EmployeeSorter sorter = new EmployeeSorter();
    private EmployeeTree tree = new EmployeeTree();

    // load employees from the file
    public boolean loadEmployees() {
        return model.readFile("data/Applicants_Form.txt");
    }

    // sort employees by name
    public void sortEmployees() {
        sorter.mergeSort(model.getEmployees());
    }

    // add employees to the tree
    public void buildTree() {
        tree = new EmployeeTree();

        for (Employee employee : model.getEmployees()) {
            tree.insert(employee);
        }
    }

    // return the model
    public EmployeeModel getModel() {
        return model;
    }

    // return the tree
    public EmployeeTree getTree() {
        return tree;
    }
}