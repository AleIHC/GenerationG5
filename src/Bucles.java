import java.util.Scanner;

public class Bucles {

    public static void main(String[] args) {
        /**
        //Búcle while
        int variableMaxima = 0;
        //La sintaxis empieza con la plabra reservada WHILE y la condicion que se debe cumplir
        while (variableMaxima <= 10) {
            System.out.println(variableMaxima);
            variableMaxima++;
        }

        //While usando input por consola
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número del 1 al 10");
        int opcion = scanner.nextInt();
        boolean condicionDeTermino = false;

        if (opcion < 10 && opcion > 5 ) {
            condicionDeTermino = true;
        }

        while (condicionDeTermino) {
            System.out.println("Bienvenido a la cámara de los secretos");
            System.out.println("Selecciona el numero del 1 al 10");
            opcion = scanner.nextInt();
            if (opcion < 9 && opcion > 7) {
                System.out.println("Felicidades mataste al basilisco");
                condicionDeTermino = false;
            } else {
                System.out.println("Quedaste petrificado");
            }
        }

        System.out.println("Ya saliste del bucle");
         */
        //Bucle Do-While
        int variableUnica = 10;
        //En do { BLOQUE DE CÓDIGO A EJECUTARSE POR LO MENOS UNA VEZ } while (condición)
        do {
            System.out.println("El número de la variable unica es: " + variableUnica);
            variableUnica++;
        } while (variableUnica <= 12);

        //
        Scanner scanner = new Scanner(System.in);
        String pokemonMisterioso = "";

        do {
            System.out.println("Ingresa el primer pokemon de la Pokedex");
            pokemonMisterioso = scanner.nextLine();
            //Acá comparamos con la condición, usamos equalsIgnoreCase que ignora las mayúsculas att Sabrina
            if (!(pokemonMisterioso.equalsIgnoreCase("Bulbasaur"))) {
                System.out.println("Sigue intentando, te falta ver el pokerap");
            } else {
                System.out.println("Super, aquí está tu pokemon");
            }
        } while (!(pokemonMisterioso.equalsIgnoreCase("Bulbasaur")));

        }
}
