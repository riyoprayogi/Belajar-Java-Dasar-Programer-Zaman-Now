public class KonversiNumber {

    public static void main(String[] args) {

        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;
        long iniLong = iniInt;
        float iniFloat = iniLong;
        double iniDouble = iniFloat;

        float iniFloat2 = (float) iniDouble;
        long iniLong2 = (long) iniFloat;
        int iniInt2 = (int) iniLong2;
        short iniShort2 = (short) iniInt2;
        // dan seterusnya

        System.out.println(iniLong2);



    }

}
