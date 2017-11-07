import java.time.LocalDate;

public class Person extends AbstractPerson {

    private int id;
    private String firstName;
    private String lastName;
    private int age;

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public void setLastName(String lastName) {
         this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "#" + this.id + " " + this.firstName + " " + this.lastName + ", age " + this.age;
    }

    // Unused Methods
    @Override
    public LocalDate getDob() {
        return null;
    }

    @Override
    public void setDob(LocalDate dob) {
    }

    @Override
    public Gender getGender() {
         return null;
    }

    @Override
    public void setGender(Gender gender) {
    }
}
