public class Main {
    public static void main(String[] args) {
        int a = 9;
        int b = 2;

        double result = (double) a / b;
        int rest = a % b;

        System.out.println(result);
        System.out.println(rest);

        if (a % b == 0) {
            System.out.println("Divisible");
        }

        else {
            System.out.println("Not divisible");
        }
    }
}
