import javax.swing.*;
import java.util.Scanner;

public class Condicionales {

    public static void main(String[] args) {

        //Operadores
        //Asignación: Igual(=)
        //Operadores aritméticos: Suma(+), resta(-), multiplicación(*), división(/), resto(%)
        //Operadores unarios o unitario en JS: Incremento(++), decremento(--), complemento lógico(!)
        //Operadores comparativos: menor qué(<), mayor qué(>), menor o igual(<=), mayor o igual(>=), distinto de(!=)
        //Operadores lógicos: y lógica(&&), o lógica(||), no lógico(!)

        int sumaEjemplo = 2+2;
        System.out.println(sumaEjemplo);
        int restoEjemplo = 15 % 4;
        System.out.println(restoEjemplo);
        boolean verdadero = true;
        boolean falso = !(verdadero);
        System.out.println(falso);
        System.out.println("*****************NOTAS DEL ESTUDIANTE**********************");

        /*Notas Estudiante*/
        Scanner notas = new Scanner(System.in);
        System.out.println("Ingrese las tres notas del estudiante");
        float nota1 = notas.nextFloat();
        float nota2 = notas.nextFloat();
        float nota3 = notas.nextFloat();
        float promedio = (nota1 + nota2 + nota3)/3;
        float notaAprobatoria = 4.0f;
        float notaSobresaliente = 6.5f;
        System.out.println("Cuál es la mayor nota del curso");
        float notaMayorDelCurso = notas.nextFloat();
        System.out.println("El promedio del estudiante es = " + promedio);
        boolean estudianteAprobo = (promedio >= notaAprobatoria);
        System.out.println("El estado de aprobación del estudiante es: " + estudianteAprobo);

        //Condicional que toma la variable
        if (estudianteAprobo) {
            System.out.println("Aprobaste!!");
        } else  {
            System.out.println("Más suerte para la próxima");
        }

        //Si la nota fuera negativa, muestra un mensaje indicando que no es valido, en caso contrario, mostrar un mensaje de que es válido
        if (promedio < 0) {
            System.out.println("Ingresaste un dato no válido");
        } else {
            System.out.println("Ingresaste un dato válido ¡Muchas gracias!");
        }

        /**
        //Condicional para probar si el promedio es distinto de la nota mayor
        if (promedio != notaMayor) {
            System.out.println("Sí, el promedio es distinto");
        } else {
            System.out.println("No, es la misma");
        }

        //Condicional para evaluar si nota sirve para el promedio general
        if (promedio >= 5) {
            System.out.println("Tu nota sirve para el promedio general ¡Felicitaciones!");
        } else {
            System.out.println("No te alcanzó, esfuérzate más para la próxima");
         }**/

        //Condicional para evaluar si puede postular a beca (Att: Damaris)
        if (promedio >=6.5){
            System.out.println("Felicidades, por tu promedio puedes postular a becas");
        } else {
            System.out.println("Tu promedio es insuficiente para postular a becas, suerte para la próxima");
        }

        //Condicional para determinar si aprobó Y superó la nota mayor del curso
        if ((promedio >= notaAprobatoria) && (promedio > notaMayorDelCurso)) {
            System.out.println("Te ganaste un chocolatito");
        } else {
            System.out.println("Hay Tabla!!");
        }

        //Condicional para determinar si el promedio es mayor a n O si el promedio es mayor a la nota mayor del curso
        if ((promedio > notaSobresaliente) || (promedio > notaMayorDelCurso)) {
            System.out.println("Te ganaste un copete");
        } else {
            System.out.println("Te toca tomar agua");
        }

        /**Condicional para determinar si cada nota es menor 4
        if(!(nota1 < 4) && !(nota2 < 4) && !(nota3 < 4)) {
            System.out.println("En la nota 1 obtuviste: "
                    + nota1 + " En la nota 2 obtuviste: "
                    + nota2 + " En la nota 3 obtuviste: "
                    + nota3 + " Eso significa que obtuviste azul");
        } else {
            System.out.println("Obtuviste rojo");
        }**/

        //Condicional para comparar cada nota, usando el operador O
        if((nota1 < 4) && (nota2 < 4) || (nota3 < 4)) {
            System.out.println("En la nota 1 obtuviste: "
                    + nota1 + " En la nota 2 obtuviste: "
                    + nota2 + " En la nota 3 obtuviste: "
                    + nota3 + " Eso significa que obtuviste azul");
        } else {
            System.out.println("Obtuviste rojo");
        }

        //Condicional donde necesitamos indicar más de una condicion
        if (promedio >= notaSobresaliente) {
            System.out.println("Gracias por el esfuerzo, te mereces una celebración");
        } else if ((promedio < notaSobresaliente) && (promedio >= notaAprobatoria)){
            System.out.println("Bien hecho, pero no lo suficiente");
        } else {
            System.out.println("Más esfuerzo para la próxima");
        }

        System.out.println("*****************ACÁ TERMINA PROGRAMA DE NOTAS**********************");

        System.out.println("*****************NÚMERO DE LA SUERTE**********************");

        //Switch
        System.out.println("Hola, me puede indicar un número del 1 al 10");
        int numeroDeLaSuerte = notas.nextInt();
        switch (numeroDeLaSuerte) {
            case 1:
                System.out.println("No es el correcto");
                break;
            case 2:
                System.out.println("Sigue intentando");
                break;
            case 3:
                System.out.println("Ya casi");
                break;
            case 6:
                System.out.println("Felicidades, te has ganado la lotería");
                break;
            default:
                System.out.println("En esta ocasión no ganaste nada, pero suerte para la próxima");
                break;
        }
    }
}
