public class PrePostIncrement {
    public static void main(String[] args) {
        int x = 10;
        int result = x++ + ++x;

        System.out.println("x = " + x);
        System.out.println("result = " + result);
    }
}
