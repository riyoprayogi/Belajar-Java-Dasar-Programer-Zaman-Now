public class SwitchLamda {
    public static void main(String[] args) {

        var nilai = "A";

        switch (nilai) {
            case "A" -> System.out.println("Wow, Anda Lulus Dengan Baik");
            case "B", "C" -> System.out.println("Anda Lulus");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default -> {
                System.out.println("Mungkin Anda Salah Jurusan");
            }
        }

        // Switch Tanpa Yield
        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = "Wow, Anda Lulus Dengan Baik";
            case "B", "C" -> ucapan = "Anda Lulus";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default -> ucapan = "Mungkin Anda Salah Jurusan";
        }
        System.out.println(ucapan);

        // Switch Dengan Yield
        ucapan = switch (nilai) {
            case "A" :
                yield  "Wow, Anda Lulus Dengan Baik";
            case "B", "C" :
                yield  "Anda Lulus";
            case "D" :
                yield "Anda Tidak Lulus";
            default :
                yield "Mungkin Anda Salah Jurusan";
        };
        System.out.println(ucapan);
    }
}