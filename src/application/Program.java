/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Employee;
import entities.OutsourcedEmployee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.print("Enter the number of employees: ");
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            System.out.print("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)? ");

            char out = sc.next().charAt(0);

            System.out.print("Name?");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (out == 'y') {
                System.out.print("Additional charge: ");
                double addOut = sc.nextDouble();
                list.add(new OutsourcedEmployee(addOut,name, hours,valuePerHour ));

            }else{
                
                list.add(new Employee(name, hours, valuePerHour));
            }
            System.out.println();
            System.out.println("PAYMENTS: ");
            
            for(Employee c: list){
                System.out.println(c.getName() + " - $ " + String.format("%.2f ", c.payment()) );
            }
        }
    }

}
 