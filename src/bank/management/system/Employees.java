package bank.management.system;

/**
 * Creating an Employees class with params id, name, gender
 */

public class Employees {
    private int id;
    private String name;
    private String gender;
    private int salary;

    //Constructors are used to create new objects
    public Employees (int id, String name, String gender, int salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }


    // getter functions for id,name,gender,salary
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Id: "+id+" | Name: "+name+" | Gender: "+gender+" | Salary: "+salary;
    }
}
