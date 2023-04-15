//Реализовать простой калькулятор
//Минимум -- > Условия + Цикл
//        Введите число
//        Введите число
//        Выберите операцию
//        1 - сложить
//        2 - умножить
//        ...
import java.util.InputMismatchException;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        calculator();
    }

    public static void calculator() {
        double num1;
        double num2;
        double ans;
        char op;

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число:");
            num1 = scanner.nextDouble();
            System.out.println("Введите символ операции (+, -, *, /):");
            op = scanner.next().charAt(0);
            System.out.println("Введите второе число:");
            num2 = scanner.nextDouble();

            switch (op) {
                case '+' -> ans = num1 + num2;
                case '-' -> ans = num1 - num2;
                case '*' -> ans = num1 * num2;
                case '/' -> {
                    if(num2 == 0) {
                        System.out.println("Операция деления на ноль невозможна");
                        return;
                    }
                    ans = num1 / num2;
                }
                default -> {
                    System.out.println("Неверно введён символ операции");
                    return;
                }
            }
            System.out.printf("%f %s %f = %f", num1, op, num2, ans);

        } catch (InputMismatchException e) {
            System.out.println("Введены некорректные данные");
        }
    }
}
