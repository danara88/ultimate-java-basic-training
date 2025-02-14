package module6;

public class EComparable {
    public static void execute() {
        var user1 = new User("Daniel", "Aranda", 24);
        var user2 = new User("Dario", "Aranda", 27);

        // Comparamos ambos usuarios
        System.out.println(user1.compareTo(user2)); // 24 - 27 retorna negativo
        System.out.println(user2.compareTo(user1)); // 27 - 24 retorna positivo
    }

    /**
     * Podemos implementar de Comparable
     */
    static class User implements Comparable<User>{
        public String name;

        public String surname;

        public int age;

        User(String name, String surname, int age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

        public void speak() {
            System.out.println("Hello World");
        }

        /**
         * Comparar this con la otra instancia "o".
         * Si la comparación no se cumple, entonces devolver numero negativo (cualquiera).
         * Si la comparación se cumple, podemos devolver cualquier numero positivo (cualquiera).
         * Si la comparación es igual, podemos retornar 0
         */
        @Override
        public int compareTo(User o) {
            // Si tienen la misma edad, devuleve 0
            // Si esta instancia es mayor, devuelve numero psoitivo.
            // Si la otra instancia es mayor, devuelve numero negativo.
            return this.age - o.age;
        }
    }
}
