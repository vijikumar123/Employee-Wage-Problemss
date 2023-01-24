package com.bridgelabz.employeewage;

import java.util.Scanner;

public class EmployeeWage {
    // UC-1------
    void checkEmployeeAttendence() {
        int IS_FULL_TIME = 1;
        double empCheck = (int)(Math.random() * 2) ;
        if (empCheck == IS_FULL_TIME)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }

    //UC-2------------
    void dailyEmployeeWage() {
        int fullTime = 1;
        int employeeWagePerHour = 20;
        int employeeHrs = 0;
        int employeeWage = 0;

        double employeeCheck = Math.floor(Math.random() * 10) % 2;
        if (employeeCheck == fullTime)
            employeeHrs = 8;
        else
            employeeHrs = 0;

        employeeWage = employeeHrs * employeeWagePerHour;
        System.out.println("Employee Wage " + employeeWage);
    }

    //UC-3----------------------------
    void dailyEmployeePartTimeWage() {
        int fullTime = 2;
        int partTime = 1;
        int employeeWagePerHour = 20;
        int employeeHrs = 0;
        int employeeWage = 0;

        int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
        if (employeeCheck == fullTime)
            employeeHrs = 16;
        else if (employeeCheck == partTime)
            employeeHrs = 8;
        else
            employeeHrs = 0;

        employeeWage = employeeHrs * employeeWagePerHour;
        System.out.println("Employee Wage " + employeeWage);
    }

    // UC-4-SwitchCase-------------------
    int switchcase() {
        int employeeWagePerHour = 20;
        int employeeHrs = 0;
        int employeeWage = 0;
        int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (employeeCheck) {
            case 1:
                employeeHrs = 16;
                break;
            case 2:
                employeeHrs = 8;
                break;
            default:
                employeeHrs = 0;
        }

        employeeWage = employeeHrs * employeeWagePerHour;

        return employeeWage;

    }

    // UC-5----------------
    void employeeMonthlyWage() {
        int fullTime = 2;
        int partTime = 1;
        int employeeWagePerHour = 20;
        int workingDaysPerMonth = 20;
        int employeeHrs = 0;
        int employeeWage = 0;
        int monthlyWage = 0;
        for (int day = 0; day < workingDaysPerMonth; day++) {
            int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (employeeCheck) {
                case 1:
                    employeeHrs = 16;
                    break;
                case 2:
                    employeeHrs = 8;
                    break;
                default:
                    employeeHrs = 0;

            }
            employeeWage = employeeHrs * employeeWagePerHour;
            monthlyWage += employeeWage;
            System.out.println("Employee wage:" + employeeWage);
        }
        System.out.println("Total Employee Wage " + monthlyWage);
    }

    //UC-6----------
    void employeeMonthlyWageWhileloop() {

        int employeeWagePerHour = 20;
        int workingDaysPerMonth = 20;
        int employeeHrs = 0;
        int employeeWage = 0;
        int totalEmployeeHours=0;
        int maximumHoursInMonth=100;
        int totalWorkingDays=0;
        while(totalEmployeeHours<= maximumHoursInMonth &&
                totalWorkingDays<workingDaysPerMonth) {
            totalWorkingDays++; {
                int employeeCheck=(int)Math.floor(Math.random() *10) %3;
                switch(employeeCheck) {
                    case 1 :
                        employeeHrs=16;
                        break;
                    case 2 :
                        employeeHrs=8;
                        break;
                    default:
                        employeeHrs=0;

                }
                employeeWage = employeeHrs * employeeWagePerHour;

                totalEmployeeHours += employeeHrs;
                System.out.println("Day#: " + totalWorkingDays + " EmpHour: " +employeeHrs);
            }
            int totalEmployeeWage= totalEmployeeHours * employeeWagePerHour;
            System.out.println("Total Employee Wage " +totalEmployeeWage);
        }
    }


    public static void main(String[] args) {
        EmployeeWage Emp = new EmployeeWage();
        // Emp.checkEmployeeAttendence();
        //Emp.dailyEmployeeWage();
        // Emp.dailyEmployeePartTimeWage();
        // Emp.employeeMonthlyWage();
        // System.out.println(Emp.switchcase());
        Emp.employeeMonthlyWageWhileloop();
    }
}

