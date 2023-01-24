package com.bridgelabz.employeewage;

import java.util.Scanner;

public class EmployeeWage {
    void checkEmployeeAttendence() {
        int IS_FULL_TIME = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;

        if (empCheck == IS_FULL_TIME)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }

    void dailyEmployeeWage() {
        int fullTime=1;
        int employeeWagePerHour=20;
        int employeeHrs=0;
        int employeeWage=0;

        double employeeCheck = Math.floor(Math.random() * 10) % 2;
        if ( employeeCheck == fullTime)
            employeeHrs=8;
        else
            employeeHrs=0;

        employeeWage=employeeHrs * employeeWagePerHour;
        System.out.println("Employee Wage " + employeeWage);
    }

    void dailyEmployeePartTimeWage() {
        int fullTime=2;
        int partTime=1;
        int employeeWagePerHour=20;
        int employeeHrs=0;
        int employeeWage=0;

        double employeeCheck = Math.floor(Math.random() * 10) % 3;
        if ( employeeCheck == fullTime)
            employeeHrs=16;
        else if
        ( employeeCheck == partTime)
            employeeHrs=8;
        else
            employeeHrs=0;

        employeeWage=employeeHrs * employeeWagePerHour;
        System.out.println("Employee Wage " + employeeWage);
    }

    public static void main(String[] args) {
        EmployeeWage Emp = new EmployeeWage();
        	Emp.checkEmployeeAttendence();
        //Emp.dailyEmployeeWage();
        Emp.dailyEmployeePartTimeWage();

    }


}
