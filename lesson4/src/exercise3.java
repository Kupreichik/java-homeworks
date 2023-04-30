import java.util.Iterator;
import java.util.LinkedList;

public class exercise3 {
    // Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
    public static void main(String[] args) {
        LinkedList<Integer> list = (LinkedList<Integer>) exercise1.createList();
        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();
        Integer sum = 0;
        while (iterator.hasNext()) {
            sum += iterator.next();
        }
        System.out.println(sum);
    }

}
