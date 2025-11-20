public class CompanyApp {
    public static void main(String[] args) {

        Company warsawCompany = new Company();
        WriteAndReadToFile wrToFile = new WriteAndReadToFile();
        String fileName = "wrs.obj";
        
        Employee emp1 = new Employee("emil", "gul", 9898);
        Employee emp2 = new Employee("emil", "gul", 9898);
        Employee emp3 = new Employee("emil", "gul", 9898);
        
        warsawCompany.addEmployee(emp1);
        warsawCompany.addEmployee(emp2);
        warsawCompany.addEmployee(emp3);
        warsawCompany.showEmployee();

        wrToFile.ObjectWriter(fileName, warsawCompany);
        wrToFile.ObjectReader(fileName).showEmployee();;

        System.out.println();

    }
}