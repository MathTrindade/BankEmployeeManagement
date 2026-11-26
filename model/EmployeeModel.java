/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package bankemployeemanagement.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeModel {

    private ArrayList<Employee> employees = new ArrayList<>();

    // read the employee file
    public boolean readFile(String fileName) {

        try {
            Scanner reader = new Scanner(new File(fileName));

            employees.clear();

            // skip the first line
            if (reader.hasNextLine()) {
                reader.nextLine();
            }

            // read the information line by line
            while (reader.hasNextLine()) {

                String line = reader.nextLine();
                String[] data = line.split(",");

                if (data.length >= 9) {

                    String name = data[0] + " " + data[1];
                    String managerType = data[7].trim();
                    String department = data[5].trim();

                    Employee employee = new Employee(
                            name, managerType, department);

                    // add employee to the list
                    employees.add(employee);
                }
            }

            reader.close();
            return true;

        } catch (FileNotFoundException e) {
            return false;
        }
    }

    // return the employees list
    public ArrayList<Employee> getEmployees() {
        return employees;
    }
}
