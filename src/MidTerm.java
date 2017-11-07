public class MidTerm {

    static private int[] data = { 1, 2, 3 };

    static public void showIntData () {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }

    static void demo () {
        // 1. create a showIntData() method.
        System.out.println("showIntData():");
        MidTerm.showIntData();
    }
}
