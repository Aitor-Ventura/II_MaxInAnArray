import java.util.Scanner;
/**
 * Ejercicio de Introducción a la Informática
 */
public class MainClass {
    /**
     * Desarrolle el método max para que devuelva el mayor valor de entre
     * los n primeros elementos de un array leído con la istrucción:
     * double[] myArray = Internal.loadFloatArray(input);
     * @param array: array donde se va a buscar el valor mayor
     * @param n: número de elementos del array a considerar
     * @return el mayor valor entre los n primeros elementos de array
     */
    public static double max(double[] array, int n) {
        double result = -5;
        for (int i = 0; i < n; i++){
            if (array[i] > result){
                result = array[i];
            }
        }
        return result;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Se lee un array unidimensional de elementos de tipo int

        double[] myArray = Internal.loadDoubleArray(input);
        double highest = max(myArray, myArray.length);
        System.out.println("El valor mayor es: " + highest);
    }
}