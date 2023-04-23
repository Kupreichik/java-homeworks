import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class exercise3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "Mercury", "Venus", "Mars", "Mercury", "Earth", "Mars", "Jupiter",
                "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto", "Jupiter", "Jupiter");
        System.out.println(list);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);

        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i).equals(list.get(i+1))) {
                count++;
            }else{
                sb.append(list.get(i))
                        .append(": ")
                        .append(count)
                        .append("; ");
                count = 1;
            }
        }
        sb.append(list.get(list.size() - 1)).append(": ").append(count).append(".");

        System.out.println(sb);
    }
}
