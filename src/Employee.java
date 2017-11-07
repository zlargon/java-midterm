
public class Employee extends AbstractEmployee {

    private double wage;

    public Employee (Student student, double wage) {
        this.setId(student.getId());
        this.setFirstName(student.getFirstName());
        this.setLastName(student.getLastName());
        this.setAge(student.getAge());
        this.setWage(wage);
    }

    @Override
    public double getWage() {
        return this.wage;
    }

    @Override
    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return super.toString() + ", wage $" + this.wage;
    }
}
