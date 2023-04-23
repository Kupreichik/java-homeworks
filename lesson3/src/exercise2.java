import java.util.Collections;
import java.util.List;

public class exercise2 {
    //Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее
    // арифметическое из этого списка. Collections.max()
    public static void main(String[] args) {
        List<Integer> list = exercise1.createList(10, 0,10);
        System.out.println(list);

        int max = Collections.max(list);
        int min = Collections.min(list);
        double average = (double) ((max + min)/2);

        System.out.printf("Минимальное число: %d\nМаксимальное число: %d\nСреднее арифметическое: %f", min, max,average);
    }
}
