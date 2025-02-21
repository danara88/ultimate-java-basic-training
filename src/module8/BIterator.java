package module8;

import java.util.ArrayList;
import java.util.Iterator;

public class BIterator {
    public void execute() {
        var myList = new MyListV2<Number>();

        // Java hace el siguiente código por debajo en el byte code al momento de implementar el for each
        //
        // var iteator =  myList.iterator();
        // while (iteator.hasNext()) {
        //     var elemnt = iteator.next();
        //     System.out.println(elemnt);
        // }

        myList.add(1);
        myList.add(2);

        // Esta es la implementacion a alto nivel
        for (Number elemnt : myList) {
            System.out.println(elemnt);
        }
    }
}

class MyListV2<T> implements Iterable<T> {
    private final ArrayList<T> _data;
    private  int _length = 0;

    public MyListV2() {
        _data = new ArrayList<>();
    }

    public MyListV2<T> add(T t) {
        _data.add(t);
        _length++;
        return this;
    }

    public T get(int index) {
        return _data.get(index);
    }

    @Override
    public Iterator<T> iterator() {
        return new ListaIterator(this);
    }

    private class ListaIterator implements Iterator<T> {
        private MyListV2<T> _myList;
        private int _index = 0;

        public ListaIterator(MyListV2<T> myList) {
            _myList = myList;
        }

        @Override
        public boolean hasNext() {
            return _index < _myList._length;
        }

        @Override
        public T next() {
            return _myList._data.get(_index++);
        }
    }
}
