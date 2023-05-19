import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ArreglosDinamicos {

    public static void main(String[] args) {

        //Arreglos dinamicos
        //ArrayList<TIPO DE DATO> nombreDelArray = new ArrayList<>();
        ArrayList<String> pokemones = new ArrayList<>();
        //Agregar pokemones
        pokemones.add("Eevee");
        pokemones.add("Chikorita");
        pokemones.add("Jigglypuff");
        pokemones.add("Snorlax");
        pokemones.add("Jynx");
        pokemones.add("Ninetales");
        pokemones.add("Mewtwo");
        pokemones.add("Ditto");
        pokemones.add("Agumon");
        //Imprimimos el ArrayList
        System.out.println(pokemones);
        //Obtener un pokemon del ArrayList. Para obtener un elemento del ArrayList usamos el metodo .get
        // y le indicamos el índice
        System.out.println(pokemones.get(2));
        //Para remover un pokemon utilizamos el método .remove y le indicamos el indice, destacar que nos vaa  retornar
        //ese elemento
        System.out.println(pokemones.remove(pokemones.size() - 1));
        //String infiltrado = pokemones.remove(4);
        //Imprimiendo la longitud del arreglo, usamos método .size
        System.out.println(pokemones.size());
        //Recorriendo el ArrayList
        //for (VARIABLE ITERADORA; CONDICION; EFECTO) { codigo a ejecutarse si se cumple la condición }
        for (int i = 0; i < pokemones.size(); i++) {
            System.out.println("El pokemon en la posición " + i + " es: ");
            System.out.println(pokemones.get(i));
        }

        /*
        //HashSet no permite añadir duplicados y la otra diferencia es que no tiene índices
        HashSet<String> digimon = new HashSet<>();
        //Añadir elementos al HashSet
        digimon.add("Agumon");
        digimon.add("Patamon");
        digimon.add("Beelzemon");
        digimon.add("Felipemon");
        digimon.add("Patamon");
        //Imprimimos nuestro HashSet
        System.out.println(digimon);
        //Remover del HashSet, no retorna lo que está en el índice y compara el elemento que le indiquemos
        // y si está lo remueve y retorna true
        Boolean digimonRemovido = digimon.remove("Felipemon");
        System.out.println(digimonRemovido);
        //Obtener del HashSet, no hay manera de obtenerlo con el índice
        //Solución de Lucas, nos retorna un optional
        String digimonSeleccionado = String.valueOf(digimon.stream().findFirst());
        System.out.println(digimonSeleccionado);
        //Solucion de Denisse, guardando lo que vamos a buscar en una variable
        String targetElement = "Patamon";
        if (digimon.contains("Patamon")) {
            System.out.println(targetElement + " is present in the HashSet.");
        } else {
            System.out.println(targetElement + " is not found in the HashSet.");
        }
        //Solución Damaris, el método forEach nos permite iterar sobre el arreglo
        //Sólo hay que indicar el nombre que le vamos a dar a cada ELEMENTO
        digimon.forEach(name->{
            System.out.println(name);
        });
        //Solución Sabrina
        Object[] arregloDigimon = digimon.toArray();
        System.out.println(Arrays.toString(arregloDigimon));
        */

        /**
        //El map es una lista que agrupa LLAVE:VALOR
        //La sintaxis es la siguiente: HashMap<TIPO DE DATO(LLAVE),TIPO DE DATO(VALOR)> nombreDelHashMap =
        HashMap<String, Integer> ataquePokemon = new HashMap<String, Integer>();
        //Agregar al HashMap
        ataquePokemon.put("Charmander", 10);
        ataquePokemon.put("Bulbasaur", 6);
        ataquePokemon.put("Squirtle", 7);
        ataquePokemon.put("Felipemon", 11);
        System.out.println(ataquePokemon);
        //Obtener del HashMap
        System.out.println(ataquePokemon.get("Bulbasaur"));
        //El replace sirve para reemplazar el valor dentro de una llave
        ataquePokemon.replace("Felipemon", 11, 9);
        System.out.println(ataquePokemon);
        //Comprobar si existe un valor o una llave y retorna un boolean
        ataquePokemon.containsKey("Felipemon");
        **/






        }
}
