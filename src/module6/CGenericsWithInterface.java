/**
 * Execute training courses code here.
 * The trainings are in different classes.
 */
package module6;

import java.util.ArrayList;

public class CGenericsWithInterface {
    public static void execute() {
        var user1 = new User("Daniel");
        var user2 = new User("Gerardo");
        var user3 = new User("Maria");

        var userList = new MyListV2<User>();
        
        userList.add(user1)
                .add(user2)
                .add(user3);

        User foundUser = userList.get(0);
        foundUser.attend();
    }
}

interface Attendable {
    void attend();
}

class User implements Attendable {
    private String _name;

    User(String name) {
        _name = name;
    }

    @Override
    public void attend() {
        System.out.println("Attending User by " + _name);
    }
}

// Extender de clases que implemeneten la interfaz de Attednable
class MyListV2<T extends Attendable> {
    private final ArrayList<T> _data;

    public MyListV2() {
        _data = new ArrayList<>();
    }

    public MyListV2<T> add(T t) {
        _data.add(t);
        return this;
    }

    public T get(int index) {
        return _data.get(index);
    }
}


