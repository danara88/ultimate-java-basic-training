/**
 * Execute training courses code here.
 * The trainings are in different classes.
 */
package module5;

import java.util.Objects;

/**
 * Notas:
 * Method overloading: Consiste en poder definir mas de una vez el mismo metodo con diferentes parámetros.
 * Constructor overloading: Consiste en tener mas de 1 solo constructor con diferentes parámetros.
 */
public class AOverride {
    public static void execute() {
        // Decorador Override:
        // Queremos tener la seguridad que efectivamente estamos sobre escribiendo alguna
        // propiedad/metodo de una clase padre.

        var category1 = new Category("Sports");
        var category2 = new Category("Sports");

        var isEqual = category1.equals(category2);
        System.out.println(isEqual);
    }

    public static class Category {
        private final String _name;

        Category(String name) {
            this._name = name;
        }

        // Ejemplo: Si ocupamos cambiar el tipo de paramtro aqui,
        // evitar modificarlo directamente en el metodo ya que es como
        // si escribieramos otras vez el medoto "equals" en lugar de sobre escribirlo.
        // Estarias haciendo un method overloading.

        // @Override: Esto marcara error si no estuvieramos sobre escribiendo el metodo.
        // Es como un seguro ante faltas de ortografia o que no escribamos bien el metodo
        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Category)) return super.equals(obj);


            // Comparar objetos usando sus propiedades
            var other = (Category) obj;
            return Objects.equals(this._name, other._name);
        }
    }
}