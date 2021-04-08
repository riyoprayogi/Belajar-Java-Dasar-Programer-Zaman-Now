public class MethodVariableArgument {
    public static void main(String[] args) {

        sayCongrats("Tokoyami", 88,89,89,90,81);
        sayCongrats("Gilgamesh", 50,60,65,53,79);

    }
    static void sayCongrats(String name, int... values){
        var total = 0;
        for (var value : values) {
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75){
            System.out.println("Selamat " + name + ", Anda Lulus :)");
        }else {
            System.out.println("Mohon maaf " + name + ", Anda Tidak Lulus :(");
        }
    }
}
