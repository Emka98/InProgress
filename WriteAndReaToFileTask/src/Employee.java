class Employee extends Person{

    private double sallary;

    Employee(String name, String surename, double sallary){
        super(name,surename);
        this.sallary = sallary;
    }

    public double getSallary() {
        return sallary;
    }
    
    public void setSallary(double sallary) {
        this.sallary = sallary;
    }    
}
