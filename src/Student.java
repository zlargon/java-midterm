public class Student extends AbstractStudent {

    private double gpa;

    public Student (Person person, double gpa) {
        this.setId(person.getId());
        this.setFirstName(person.getFirstName());
        this.setLastName(person.getLastName());
        this.setAge(person.getAge());
        this.setGPA(gpa);
    }

    @Override
    public double getGPA() {
        return this.gpa;
    }

    @Override
    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString() + ", GPA " + this.gpa;
    }
}
