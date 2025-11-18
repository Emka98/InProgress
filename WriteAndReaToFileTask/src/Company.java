import java.util.Scanner;

class Company{

    private final int MAX_EMPLOYEE = 3;
    private int current_number_employee = 0;
    Scanner sc = new Scanner(System.in);
    Employee[] tab_of_employess = new Employee[this.MAX_EMPLOYEE];

    void addUser(){
        System.out.println("Enter name of new employe:");
        String name = sc.nextLine();
        System.out.println("Enter surename: ");
        String surename = sc.nextLine();
        System.out.println("Enter gross sallary in USD:  ");
        double sallary = sc.nextDouble();

        this.tab_of_employess[current_number_employee] = new Employee(name,surename,sallary);
    }
}