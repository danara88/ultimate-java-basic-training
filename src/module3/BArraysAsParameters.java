package module3;

public class BArraysAsParameters {
    public static void execute() {
        System.out.println(suma(new int[] {1,2,3,4}));
    }

    static int suma(int[] numeros) {
        int resultado = 0;
        
        for(int numero : numeros) {
            resultado += numero;
        }
        return resultado;
    }
}
