import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class LifeController extends AbstractLife {

    public List<Person> personList = new ArrayList<Person>();

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
    }

    @Override
    public void loadEmployees(final List<String> personIDCSV) {
    }

    @Override
    public void agePersons(int offset, int scale) {
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
    }
}
