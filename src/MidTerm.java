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

    static void demo () {
        // 1. create a showIntData() method.
        System.out.println("showIntData():");
        MidTerm.showIntData();

        // 2. create a transformIntData() method:
        // add 1 to EACH data element and then multiply the resulting sum by 2 AND and show all data;
        System.out.println("\n\ntransformIntData():");
        MidTerm.transformIntData();
    }
}
