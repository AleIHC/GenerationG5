import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EjercicioFunciones {

    public static void main(String[] args) {

        ArrayList<Double> notasAlumno = new ArrayList<>();
        HashMap<String, Double> libroDeNotas = new HashMap<String, Double>();
        int cantDeAlumnos;
        int contador = 0;

        Scanner scanner = new Scanner(System.in);

        //Le pedimos al usuario que ingrese la cantidad de alumnos
        System.out.println("Ingrese la cantidad de alumnos");
        cantDeAlumnos = scanner.nextInt();
        //Declaramos otro scanner para recibir los nombres
        //No usar el mismo Scanner para recibir otro tipo de dato
        Scanner nombre = new Scanner(System.in);

        ArrayList<String> listaAlumnos = new ArrayList<>();

        while (contador < cantDeAlumnos) {



            System.out.println("Ingrese el nombre del alumno número " + (contador + 1));
            //Hacemos que el nombre quede guardado en una variable, usando el nuevo scanner que llamamos nombre
            String alumnoIngresado = nombre.nextLine();
            listaAlumnos.add(alumnoIngresado);
            contador++;
            System.out.println(listaAlumnos);
        }




    }


}
