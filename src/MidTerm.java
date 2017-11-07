import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MidTerm {

    static private int[] data = { 1, 2, 3 };

    static public void showIntData () {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }

    // add 1 to EACH data element and then multiply the resulting sum by 2 AND and show all data;
    static public void transformIntData () {

        for (int n : data) {
            int result = (n + 1) * 2;
            System.out.print(result + " ");
        }
    }

    // Use ListIterator to transform (add 1 and multiply sum by 2) the original data and show the transformed data
    static public void listIteratorTransformIntData1 () {
        List <Integer> numbers = new ArrayList<Integer>();
        for (int n : data) {
            numbers.add(n);
        }

        Iterator<Integer> it = numbers.listIterator();
        while (it.hasNext()) {
            int n = it.next();
            int result = (n + 1) * 2;
            System.out.print(result + " ");
        }
    }

    static public void listIteratorTransformIntData2 () {
        List <Double> numbers = new ArrayList<Double>();
        numbers.add(1.1);
        numbers.add(2.1);
        numbers.add(3.1);

        Iterator<Double> it = numbers.listIterator();
        while (it.hasNext()) {
            double n = it.next();
            double result = (n + 1) * 2;
            System.out.print(result + " ");
        }
    }

    static void demo () {
        // 1. create a showIntData() method.
        System.out.println("showIntData():");
        MidTerm.showIntData();

        // 2. create a transformIntData() method:
        // add 1 to EACH data element and then multiply the resulting sum by 2 AND and show all data;
        System.out.println("\n\ntransformIntData():");
        MidTerm.transformIntData();

        // 3. create a listIteratorTransformIntData1() method:
        // Use ListIterator to transform (add 1 and multiply sum by 2) the original data and show the transformed data;
        System.out.println("\n\nlistIteratorTransformIntData1():");
        MidTerm.listIteratorTransformIntData1();

        // 4. create a listIteratorTransformIntData2() method:
        // Repeat use of ListIterator (transform data by adding 1 and multiplying sum by 2) but for the following data: 1.1, 2.1, 3.1
        System.out.println("\n\nlistIteratorTransformIntData2():");
        MidTerm.listIteratorTransformIntData2();
    }
}
