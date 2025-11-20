import java.io.Serializable;

class Employee extends Person implements Serializable{

    private double sallary;

    public Employee(String name, String surname, double sallary){
        super(name, surname);
        this.sallary = sallary;
    }

    public double getSallary() {
        return sallary;
    }

    public void setSallary(double sallary) {
        this.sallary = sallary;
    }

    @Override
    public String toString() {
        return super.toString() + " Sallary USD: " + sallary;
    }
}