public class ConditionalOperators {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int max = (a > b && a>c) ? a : (b>c ? b : c);
        int min = (a < b && a < c) ? a : (b < c ? b : c);

        System.out.println("Bigger number is" + max);
        System.out.println("Smaller number is" + min);
    }
}
