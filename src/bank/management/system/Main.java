package bank.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Creating new Employees object
        Employees laxmi = new Employees(1, "Laxmi", "Female", 5000);
        Employees lizzy = new Employees(2, "Lizzy", "Female", 5000);
        Employees william = new Employees(3, "William", "Male", 5000);

        List<Employees> employeesList = new ArrayList<>();

        employeesList.add(laxmi);
        employeesList.add(lizzy);
        employeesList.add(william);

        //Printing employee details
//        System.out.println("Employee Details");
//        System.out.println("---------------------------------------------------------------------");
//        System.out.println(employeesList);
//
//
//        System.out.println("----------------------------------------------------------------------");
//        System.out.println("----------------------------------------------------------------------");


        //Creating new Customers object
        Customers sindhu = new Customers(1,"Sindhu",12345678);
        Customers mike = new Customers(2,"Mike",98765643);
        Customers harry = new Customers(3,"Harry",435787433);

        List<Customers> customersList = new ArrayList<>();

        customersList.add(sindhu);
        customersList.add(mike);
        customersList.add(harry);

        //sindhu bank details
        sindhu.setDeposit_amount(10000);
        sindhu.setWithdraw_amount(2000);

        //Printing customer details
        System.out.println("Customer Details");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println(sindhu);
        System.out.println("Balance Details: Deposited $"+sindhu.depositDetails());
        System.out.println("Balance Details: Withdrawn $"+sindhu.withdrawDetails());

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------");


        //Creating new Bank object
        Bank synb = new Bank("SYNB");

        //Printing Bank details
        System.out.println("Bank Details");
        System.out.println("----------------------------------------------------------------------");

//        synb.setProfitEarned(5000);
        System.out.println(synb);
        System.out.println("Profit earned is: $"+synb.getProfitEarned());

        System.out.println("----------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------");


    }
}
