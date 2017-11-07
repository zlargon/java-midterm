import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class LifeController extends AbstractLife {

    public List<Person> personList = new ArrayList<Person>();
    public List<Student> studentList = new ArrayList<Student>();

    @Override
    public void loadPersons(final List<String> personIDCSV) {
        for (String line : personIDCSV) {
            Scanner scan = new Scanner(line);
            scan.useDelimiter(",");

            int id           = scan.nextInt();
            String firstName = scan.next();
            String lastName  = scan.next();
            int age          = scan.nextInt();

            // add student to list
            Person person = new Person();
            person.setId(id);
            person.setFirstName(firstName);
            person.setLastName(lastName);
            person.setAge(age);

            // add to person list
            this.personList.add(person);

            // scan close
            scan.close();
        }
    }

    @Override
    public void loadStudents(final List<String> personIDCSV) {
        for (Person person : this.personList) {
            int id = person.getId();
            String line = personIDCSV.get(id - 1);

            Scanner scan = new Scanner(line);
            scan.useDelimiter(",");

            scan.next(); // id
            scan.next(); // first name
            scan.next(); // last name
            scan.next(); // age
            double gpa = scan.nextDouble();

            // add student to list
            Student student = new Student(person, gpa);

            // add to person list
            this.studentList.add(student);

            // scan close
            scan.close();
        }
    }

    @Override
    public void loadEmployees(final List<String> personIDCSV) {
    }

    @Override
    public void agePersons(int offset, int scale) {
        for (Person person : this.personList) {
            int age = person.getAge() + offset;
            person.setAge(age);
        }
    }

    @Override
    public void scaleStudentsGPA(double offset, double scale) {
    }

    @Override
    public void scaleEmployeeWages(double offset, double scale) {
    }

    @Override
    public void showPersons() {
        for (Person person : this.personList) {
            System.out.println(person);
        }
    }

    @Override
    public void showStudents() {
        for (Student student : this.studentList) {
            System.out.println(student);
        }
    }

    @Override
    public void showEmployees() {
    }

    @Override
    public void sortPersonsByLastName() {
        // Comparator
        Comparator<Person> byLastName = new Comparator<Person>() {
            public int compare(Person person1, Person person2) {
                String name1 = person1.getLastName();
                String name2 = person2.getLastName();
                return name1.compareTo(name2);
            }
        };

        // sort
        Collections.sort(this.personList, byLastName);
    }

    @Override
    public void sortStudentsByGPA() {
    }

    @Override
    public void sortEmployeesByWage() {
    }

    public List<String> parseCSV (String fileName) {
        Scanner input = null;
        List<String> personIDCSV = new ArrayList<String>();
        try {
            input = new Scanner(new File(fileName));

            while (input.hasNextLine()) {
                personIDCSV.add(input.nextLine());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            input.close();
        }
        return personIDCSV;
    }

    static void demo () {
        LifeController life = new LifeController();

        // 1-1. 100 POINTS Instantiate Person objects from CSV data
        System.out.println("\n\nParse People from CSV:");
        List<String> personIDCSV = life.parseCSV("data.csv");
        life.loadPersons(personIDCSV);
        life.showPersons();

        // 1-2. 100 POINTS sort all persons by last name
        System.out.println("\nSort People by last name:");
        life.sortPersonsByLastName();
        life.showPersons();

        // 2-1. increase Person age by 10 years
        System.out.println("\nincrease Person age by 10 years:");
        life.agePersons(10, 0);
        life.showPersons();

        // 2-3. Initialize Student from an already aged Person
        System.out.println("\nInitialize Student from an already aged Person:");
        life.loadStudents(personIDCSV);
        life.showStudents();
    }
}
