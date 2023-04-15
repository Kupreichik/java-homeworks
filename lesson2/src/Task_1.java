public class Task_1 {
// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//
// Пример: s = “cba”, index = [2,1,0] result “abc”
    public static void main(String[] args) {
        String s = "dcba";
        int[] index = {3,2,1,0};
        System.out.println(shuffle(s, index));
    }

    public static String shuffle(String s, int[] index){
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            sb.deleteCharAt(index[i]);
            sb.insert(index[i], s.charAt(i));
        }
        return sb.toString();
    }
}
