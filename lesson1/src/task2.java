//Вывести все простые числа от 1 до 1000

public class task2 {
    public static void main(String[] args) {
        printPrimeNumbers(1000);
    }

    public static void printPrimeNumbers(int n) {
        for (int i = 2; i <= n; i++) {
            int j = 2;
            while (i % j != 0 && j < i) {
                j++;
            }
            if(i == j) System.out.println(i);
        }
    }
}
