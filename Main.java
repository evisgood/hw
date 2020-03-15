package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        HourlyPaid employee = new HourlyPaid("Will", 8,50);
        System.out.println(employee);
        SalesCommissioned salesCom1 = new SalesCommissioned("Kim", 25,1200);
        System.out.println(salesCom1);
        Executive executive1 = new Executive("Mark", 4);
        System.out.println(executive1);

        //1st constructor with
        // this.salesCommissioned = 0;
        // this.totalSalesForMonth = 0;
        SalesCommissioned salesCommissioned1 = new SalesCommissioned("Jum");
        System.out.println(salesCommissioned1);


        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        employeeList.add(salesCom1);
        employeeList.add(executive1);
        employeeList.add(new HourlyPaid("Taivo", 6,48));
        employeeList.add(new Executive("Kert", 1));


        System.out.println("\ncomputePay \n"+ employee.computePay());
        System.out.println(salesCom1.computePay());
        System.out.println(executive1.computePay());


        System.out.println();
        //who is in employee list? getnames
        for (Employee e:employeeList){
            System.out.println(e.getName());
        }

        System.out.println();
        //who has 'i'in name
        for (Employee e:employeeList){
            if (e.getName().contains("i"))
            {
                System.out.println(e.getName());
            }
        }
        System.out.println();
        //computepay for loop for employeeList
        for (Employee e:employeeList){
            System.out.println(e.computePay());
        }
    }
}
