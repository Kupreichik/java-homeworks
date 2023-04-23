import java.util.ArrayList;
import java.util.List;

public class exercise1 {
    //Пусть дан произвольный список целых чисел, удалить из него четные числа
    public static void main(String[] args) {
        List<Integer> list = createList(10, 0, 10);
        System.out.println(list);
        removeEvenNumbers(list);
        System.out.println(list);
    }

    static void removeEvenNumbers(List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0){
                list.remove(i);
                i--;
            }
        }
    }

    static List<Integer> createList(int capacity, int min, int max){
        List<Integer> result = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            result.add((int)(Math.random() * (max-min+1) + min));
        }
        return result;
    }
}
