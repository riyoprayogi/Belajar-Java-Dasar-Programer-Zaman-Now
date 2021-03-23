public class TipeDataArray {
    public static void main(String[] args) {
        
        String[] arrayString;
        arrayString = new String[3];
        
        arrayString[0] = "Riyo";
        arrayString[1] = "Rizky";
        arrayString[2] = "Prayogi";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        String[] namaNama = {
            "Riyo", "Rizky", "Prayogi"
        };

        int[] arrayInt = new int[]{
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };

        long[] arrayLong = {
            10L, 20L, 30L
        };

        //Kode operasi di array!

        // mengubah data array
        arrayLong[0] = 100;

        System.out.println(arrayLong[0]);
        System.out.println(arrayLong[1]);
        System.out.println(arrayLong.length);

        // Array di dalam array
        String[][] members = {
            {"Riyo", "Rizky"},
            {"Budi", "Nugraha"},
            {"Joko"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
    }
    
}
