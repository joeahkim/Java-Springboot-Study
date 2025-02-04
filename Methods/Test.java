package Methods;

public class Test {
    static void add(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        add(5, 30);
        add(100, 200);
    }
}
