//Importaciones de clases de la biblioteca java.util
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Este es un comentario de línea
        /*
        * Este es un comentario de bloque
        */
        System.out.println("Celular");//El siguiente es el símil de el console.log();
        System.out.println("Una segunda impresión en consola");

        /*Variables y tipos de datos*/

        //Datos de tipo primitivo: int, boolean, long, char
        int Edad = 7;// Longitud: -2,147,483,648 to 2,147,483,647 - 4bytes
        boolean isTrue = true;
        long numeroLargo = 341234; // Longitud: -9223372036854775808 a 9223372036854775807
        short numeroCorto = 32767;//-32768	32767
        double decimal = 1.23;// Longitud: -1.79769313486232e308 a 1.79769313486232e308
        //Casting para convertir tipo de dato
        float flotante = 0.202322f;// -3.402823e38	3.402823e38
        float flotante2 = (float) 2.33241;//
        byte bit = 127;//-128 a 127
        char genero = 1;//Un solo caracter 2 bytes

        //Datos de tipo objeto
        Double doubleObjeto = 0.1231;
        Float flotanteObjeto =  doubleObjeto.floatValue();

        //Datos de Firulais
        String nombreMascota = "Firulais";
        Integer edadMascota = 10;
        Long carnetMascota = edadMascota.longValue();
        Double alturaMascota = 1.25;
        String raza = "Dálmata";
        Double peso = 20.00;
        String color = "Blanco";
        Date fechaNacimiento = new Date(2012,11,11);
        Scanner sc = new Scanner(System.in);//Instancia de la clase Scanner que nos permite ingresar datos por la consola
        System.out.println("Por favor ingrese el sexo de la mascota");
        String sexo = sc.nextLine();//Guardamos lo que ingresa la persona en la variable sexo

        //Datos de la mascota
        System.out.println("******************************************");
        System.out.println("Los datos de la mascota son los siguientes:");
        System.out.println("Su nombre es: " + nombreMascota);
        System.out.println("Su edad: " + edadMascota + " Su altura es: " + alturaMascota + "mts " + " Es un: " + raza);
        System.out.println("Su sexo es: " + sexo);

        sc.close();//Cerrar scanner

        //ArrayList
        ArrayList<String> listaNombresDeMascotas = new ArrayList<>();




    }
}