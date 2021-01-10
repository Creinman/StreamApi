import java.util.*;

public class Main {
    public static int xmax = 0;

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < intList.size(); i++) {
            int x = intList.get(i);
            if (x > 0)
                if (x % 2 == 0)
                    list.add(x);
        }

        for (int i = 0; i < list.size(); i++) {
            int e = list.get(i);
            int j = list.get(i+1);
            if (list.hasNext()==true)
            if (e > j) {
                int x = e;
                list.set(i, j);
                list.set(i+1, x);
            }
        }
        System.out.println(list);
    }
}
