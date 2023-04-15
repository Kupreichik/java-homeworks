public class Task_0 {
    // Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”
    public static void main(String[] args) {
        String jewels = "aB";
        String stones = "aaaAbbbB";
        System.out.println(findJewelsInStones(jewels, stones));
    }

    public static String findJewelsInStones(String jewels, String stones) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jewels.length(); i++) {
            char ch = jewels.charAt(i);
            long count = stones.chars()
                    .filter(c -> c == ch)
                    .count();
            sb.append(ch);
            sb.append(count);

        }
        return sb.toString();
    }
}
