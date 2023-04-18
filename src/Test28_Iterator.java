import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class Test28_Iterator {
    public static void main(String[] args) {
        extracted1();

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("c");
        list.add("c");

        ArrayList<String> newList = getSingle(list);
        System.out.println(newList);


    }

    private static void extracted1() {
        Collection<String> c = new ArrayList<>();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");

        //获取迭代器
        Iterator<String> it = c.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static ArrayList<String> getSingle(ArrayList<String> list) {
        ArrayList<String> newList = new ArrayList<>();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            /*Object obj = it.next();
            if (!newList.contains(obj)) {
                newList.add(obj);
            }*/
            String str = it.next();
            if (!newList.contains(str)) {
                newList.add(str);
            }
        }
        return newList;
    }
}
