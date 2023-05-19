import java.util.Arrays;

public class ArreglosEstaticos {

    public static void main(String[] args) {
        //Arreglos estáticos
        //Son estáticos porque no permiten añadir más allá del índice máximo
        int[] notas = {1,2,5,7,4};
        //notas[5] = 5;
        double[] arregloDobles = new double[5];
        arregloDobles[0] = 5.32;
        arregloDobles[3] = 2.35;
        arregloDobles[4] = 1.44;
        System.out.println(notas);//Imprime la dirección en memoria
        //Arrays es la clase padre de los arreglos
        System.out.println(Arrays.toString(notas));
        //Utilizando propiedad .length para verificar longitud
        System.out.println(notas.length);
        //Imprimir un solo índice del arreglo
        System.out.println(notas[1]);
        //Imprimimos el arreglo de doubles
        System.out.println(Arrays.toString(arregloDobles));
    }
}
