import java.util.LinkedList;
//Задание 1. Удаление нечетных строк
public class DZ4_1 {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("dodo");
        ll.add("dod");
        ll.add("dodos");
        ll.add("do");
        removeOddLengthStrings(ll);
        System.out.println(ll);
    }

    public static void removeOddLengthStrings(LinkedList<String> ll){
        LinkedList<String> temp = new LinkedList<>();
        for(String s: ll){
            if( s.length() % 2 != 0){
                temp.add(s);
            }
        }
        ll.removeAll(temp);
    }
}