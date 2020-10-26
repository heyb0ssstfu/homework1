public class HomeWork1 {

    public static void main(String[] args) {
        byte b = 127; // 1b [-128, 127]
        short s = 32767; // 2b [-32768, 32767] 2 ** 15
        int i = 2_000_000_000; // 4b 2 ** 31 (2 * 10 ** 9)
        long l = 2_000_000_000_000_000_000L; // 8b 2 ** 63 (9 * 10 ** 18)
        float f = 0.6f; // 4b
        double d = 0.14; // 8b
        boolean bool = true; // true, false
        char sym = '&'; // \'"
        char sum1 = '\'';

        System.out.println("Значение типа byte =" + b);
        System.out.println("Значение типа short =" + s);
        System.out.println("Значение типа int =" + i);
        System.out.println("Значение типа long =" + l);
        System.out.println("Значение типа float =" + f);
        System.out.println("Значение типа double =" + d);
        System.out.println("Значение типа boolean =" + bool);
        System.out.println("Значение типа char =" + sym);
        System.out.println("Значение типа char =" + sum1);
    }


    public static int task3(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }


    public static boolean task4 (int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }


    public static void task5(int a) {
        if (a >= 0) System.out.println("Число " + a + "положительное");
        else System.out.println("Число " + a + " отрицательное");
    }


    public static boolean task6(int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }

    public static void task7(String name) {
        System.out.println("Привет, " + name + "!");
    }

}
