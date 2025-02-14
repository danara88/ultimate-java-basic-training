package module6;

import java.util.ArrayList;

public class BGenerics {
    public static void execute() {
        MyListV1<Integer> list = new MyListV1<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list.get(0));
    }
}
class MyListV1<T extends Number> {
    private final ArrayList<T> _data;

    public MyListV1() {
        _data = new ArrayList<>();
    }

    public void add(T t) {
        _data.add(t);
    }

    public T get(int index) {
        return _data.get(index);
    }
}

