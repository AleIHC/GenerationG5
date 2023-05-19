import java.util.Scanner;

public class Funciones {

    //Función o método main
    public static void main(String[] args) {
        //imprimirPokemon("Pikachu");
        //Scanner para solicitar datos
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un digimon");
        String digimon = scanner.nextLine();
        //imprimirDigimon(digimon);
        //imprimirSuma(213, 234, 345);
        String digimonSalvaje = digimonAtrapado(digimon);
        System.out.println(digimonSalvaje);
    }

    //Funciones sin retorno
    //La sintaxis consiste, MODIFICADOR DE ACCESO + VOID + nombre (TIPO DE DATO nombre de variable)
    // { CUERPO DE LA FUNCION}
    //Recordar que hay que declarar y luego tendríamos que invocarla
        public static void imprimirPokemon(String pokemon) {
        System.out.println("El pokemon es: " + pokemon);
    }

    public static void imprimirDigimon(String nombreArgumento) {
        System.out.println("El digimon es: " + nombreArgumento);
    }

    //Funcion con más de un argumento
    public static void imprimirSuma(int num1, int num2, int num3) {
        int suma = num1 + num2 + num3;
        System.out.println(suma);
    }

    /*****FUNCION CON RETORNO*****/
    public static String digimonAtrapado(String digimon) {
        String mensaje = "El digimon que atrapaste es: " + digimon;
        return mensaje;
    }
}
