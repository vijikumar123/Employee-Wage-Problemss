package com.bridgelabz.employeewage;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wages");
        int IS_FULL_TIME = 1;

        double employeeChek =  (int)(Math.random()*2);
        System.out.println("employeeChek");
        if(employeeChek == IS_FULL_TIME) {
            System.out.println("Employee is Present");
        }else
        {
            System.out.println("Employee is absent");
        }
    }

}