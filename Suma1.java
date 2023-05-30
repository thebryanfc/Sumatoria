public class Suma1 {
    public static void main(String[] args) {
        int[] numeros = {83, 69, 94, 110, 83, 68, 81, 91, 76, 87};
        int[] ordenados = numeros;
        int sumatoria = 0;




        for (int i = 0; i < numeros.length; i++) {
            sumatoria += numeros[i];
        }
        System.out.println("Se sumaron " + numeros.length + " elementos,");
        System.out.println("La sumatoria de los elementos del arreglo es: " +
                sumatoria);

    }//Bryan Yaziel Figueroa Castillo
}
