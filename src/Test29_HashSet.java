import java.util.*;

public class Test29_HashSet {
    public static void main(String[] args) {
        //extracted1();
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("c");
        list.add("c");
        list.add("c");

        getSingle(list);
        System.out.println(list);

    }

    private static void getSingle(List<String> list) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.addAll(list);
        list.clear();
        list.addAll(lhs);
    }

    private static void extracted1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一行字符串：");
        HashSet<Character> hs = new HashSet<>();
        String line = scanner.nextLine();
        char[] arr = line.toCharArray();

        for (char c : arr) {
            hs.add(c);
        }

        for (Character ch : hs) {
            System.out.println(ch);
        }
    }


}
