import java.util.LinkedList;

public class exercise2 {
    // Реализуйте очередь с помощью LinkedList со следующими методами:
    // enqueue() - помещает элемент в конец очереди,
    // dequeue() - возвращает первый элемент из очереди и удаляет его,
    // first() - возвращает первый элемент из очереди, не удаляя.
    private static void enqueue(LinkedList<Integer> list, int element) {
        list.add(element);
    }

    private static Integer dequeue(LinkedList<Integer> list) {
        return list.pollFirst();
    }

    private static Integer first(LinkedList<Integer> list) {
        return list.getFirst();
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        enqueue(list, 1);
        enqueue(list, 2);
        enqueue(list, 3);
        System.out.println(list);
        System.out.println(first(list));
        System.out.println(list);
        System.out.println(dequeue(list));
        System.out.println(list);

    }
}
