import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LifeController extends AbstractLife {

    @Override
    public void loadPersons(final List<String> personIDCSV) {

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

    }

    @Override
    public void showStudents() {

    }

    @Override
    public void showEmployees() {

    }

    @Override
    public void sortPersonsByLastName() {

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
        for (String s : personIDCSV) {
            System.out.println(s);
        }

    }
}
