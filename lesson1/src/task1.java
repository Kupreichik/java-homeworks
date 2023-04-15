//Вычислить n-ое треугольное число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
//Реализовать формулу на Java.
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int n = getNaturalNumber();
        printNTriangleNumber(n);
        printFactorialN(n);
    }

    public static void printNTriangleNumber(int n) {
        int nthNumber = n * (n + 1) / 2;
        System.out.printf("%d-е треугольное число = %d\n", n, nthNumber);
    }

    public static void printFactorialN(int n) {
        int factorialN = getFactorialN(n);
        System.out.printf("произведение чисел от 1 до %d = %d\n", n, factorialN);
    }

    public static int getNaturalNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число:");
        String enter = scanner.nextLine();
        while(!enter.matches("\\d+")) {
            System.out.println("Введены некорректные данные, повторите попытку:");
            enter = scanner.nextLine();
        }
        return Integer.parseInt(enter);
    }

    private static int getFactorialN(int n) {
        if(n == 1) return 1;
        return n * getFactorialN(n - 1);
    }
}
