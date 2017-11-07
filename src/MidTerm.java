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
    }
}
