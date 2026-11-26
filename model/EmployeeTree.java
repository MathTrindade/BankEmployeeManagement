/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



package bankemployeemanagement.model;

import java.util.LinkedList;
import java.util.Queue;

public class EmployeeTree {

    private EmployeeNode root;
    private int total = 0;

    // add employee inside the tree
    public void insert(Employee employee) {

        EmployeeNode newNode = new EmployeeNode(employee);

        if (root == null) {
            root = newNode;
            total++;
            return;
        }

        Queue<EmployeeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            EmployeeNode current = queue.poll();

            // check if left side is empty
            if (current.left == null) {
                current.left = newNode;
                total++;
                return;
            }

            queue.add(current.left);

            // check if right side is empty
            if (current.right == null) {
                current.right = newNode;
                total++;
                return;
            }

            queue.add(current.right);
        }
    }

    // return total employees in the tree
    public int getTotal() {
        return total;
    }

    // get the height of the tree
    public int getHeight() {
        return calculateHeight(root);
    }

    // calculate the height of each side
    private int calculateHeight(EmployeeNode node) {

        if (node == null) {
            return 0;
        }

        int leftHeight = calculateHeight(node.left);
        int rightHeight = calculateHeight(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    // show employees by level
    public void displayTree() {

        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }

        Queue<EmployeeNode> queue = new LinkedList<>();
        queue.add(root);

        int level = 1;

        while (!queue.isEmpty()) {

            int size = queue.size();

            System.out.println("\nLevel " + level + ":");

            for (int i = 0; i < size; i++) {

                EmployeeNode current = queue.poll();

                System.out.println(current.employee);

                // add the left employee
                if (current.left != null) {
                    queue.add(current.left);
                }

                // add the right employee
                if (current.right != null) {
                    queue.add(current.right);
                }
            }

            level++;
        }
    }
}