public class Continue {
    public static void main(String[] args) {

        for(var counter = 1; counter <= 100; counter++) {
            if(counter % 2 == 0) {
                continue; // untuk mengentikan perulangan saat ini, dan melajutkan ke perulangan berikutnya
            }
            System.out.println("Perulangan Ke - " + counter);
        }

    }
}
