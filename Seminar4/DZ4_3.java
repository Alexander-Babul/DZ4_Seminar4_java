import java.util.LinkedList;
/*СКОЛЬКО РАЗ СТРОКА ВСТРЕЧАЕТСЯ В СИПИСКЕ СТРОК */
public class DZ4_3 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        String value;
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("pear");
        list.add("banana");
        value = "apple";
        ListUtils utils = new ListUtils();
        System.out.println(utils.countOccurrences(list, value));


    }

    static class ListUtils {
        public static int countOccurrences(LinkedList<String> list, String value) {
            int count = 0;
            for (String s : list) {
            if (s.equals(value)) {
            count++;
            }
            }
            return count;
            }
    }
}
