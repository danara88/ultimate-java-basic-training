package module6;

public class DMultipleTypesGenerics {
    public static void execute() {
        Pairs<Integer, String> pairs = new Pairs<>(1, "Daniel");
        System.out.println(pairs.get_key());
        System.out.println(pairs.get_value());
    }
}

class Pairs<T,U> {
    private T _key;
    private U _value;

    Pairs(T key, U value) {
        _key = key;
        _value = value;
    }

    public T get_key() {
        return _key;
    }

    public U get_value() {
        return _value;
    }
}
