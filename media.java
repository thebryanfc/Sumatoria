import java.util.Arrays;
public class media {
    public class Media {

        public static void main(String[] args) {


            int[] numeros = {83, 69, 92, 101, 86, 79, 85, 91, 76, 87};
            int[] ordenados = numeros;
            int sumatoria = 0;

            double mediana=0;

            numeros = new int[]{83, 69, 92, 101, 86, 79, 85, 91, 76, 87};
            ordenados = numeros;
            sumatoria = 0;
            double media=0;



            Arrays.sort(ordenados);
            mediana = (ordenados[numeros.length / 2] + ordenados[(numeros.length / 2) - 1]) / 2;

            for (int i = 0; i < numeros.length; i++) {
                sumatoria += numeros[i];
            }

            media = (double) sumatoria / numeros.length;
            Arrays.sort(ordenados);





            System.out.println("Se sumaron " + numeros.length + " elementos,");
            System.out.println("La sumatoria de los elementos del arreglo es: " +
                    sumatoria);
            System.out.println("Los elementos  del arreglo ordenado son: " +
                    Arrays.toString(ordenados));
            System.out.println("la mediana es: "+mediana);
            System.out.println("la media es; "+media);
        }
 }
}
