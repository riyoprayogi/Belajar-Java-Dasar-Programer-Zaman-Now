public class RecursiveMethod {
    public static void main(String[] args) {

        System.out.println(faktorialLoop(5));
        System.out.println(factorialRecursive(5));


    }

    static int faktorialLoop(int value){
        var result = 1;

        for(var counter = 1; counter <= value; counter++) {
            result *= counter;
        }

        return result;
    }

    // Dengan Recursive Method
    static int factorialRecursive(int value) {
        if(value == 1){
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }

}
