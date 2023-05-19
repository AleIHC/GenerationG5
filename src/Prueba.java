import java.util.Locale;
import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println(scanner.locale().getDisplayCountry());
        System.out.println("Introduce un número decimal");
        float decimal = scanner.nextFloat();
        System.out.println(decimal);
    }
}
