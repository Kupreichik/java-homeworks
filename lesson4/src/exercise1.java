import java.util.*;

public class exercise1 {
    // Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
    // Постараться не обращаться к листу по индексам.
    private static void reverseList(LinkedList<Integer> list) {
        Collections.reverse(list);
    }

    static List<Integer> createList(){
        LinkedList<Integer> result = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            result.add(new Random().nextInt(10) + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = (LinkedList<Integer>) createList();
        System.out.println(list);
        reverseList(list);
        System.out.println(list);
    }
}
