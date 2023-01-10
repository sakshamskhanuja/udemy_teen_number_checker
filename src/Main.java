public class Main {
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
    }

    /**
     * Checks if either one of the person is a teenager.
     */
    public static boolean hasTeen(int a, int b, int c) {
        return (isTeen(a) || isTeen(b) || isTeen(c));
    }

    /**
     * Checks whether person is a teenage.
     */
    public static boolean isTeen(int age) {
        return (age > 12 && age < 20);
    }
}