/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package bankemployeemanagement.model;

import java.util.ArrayList;

public class EmployeeSorter {

    // sort the employees by name
    public void mergeSort(ArrayList<Employee> employees) {

        if (employees.size() <= 1) {
            return;
        }

        int middle = employees.size() / 2;

        ArrayList<Employee> left = new ArrayList<>();
        ArrayList<Employee> right = new ArrayList<>();

        // divide the list in two parts
        for (int i = 0; i < middle; i++) {
            left.add(employees.get(i));
        }

        for (int i = middle; i < employees.size(); i++) {
            right.add(employees.get(i));
        }

        // sort both parts again
        mergeSort(left);
        mergeSort(right);

        // put both parts together
        employees.clear();

        int i = 0;
        int j = 0;

        while (i < left.size() && j < right.size()) {

            if (left.get(i).getName().compareToIgnoreCase(
                    right.get(j).getName()) <= 0) {

                employees.add(left.get(i));
                i++;

            } else {

                employees.add(right.get(j));
                j++;
            }
        }

        // add the names left in the list
        while (i < left.size()) {
            employees.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            employees.add(right.get(j));
            j++;
        }
    }
}
