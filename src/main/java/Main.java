import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Stream;

public class Main {

    private static int contador = 0;

    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Pepe");
        nombres.add("Paco");
        nombres.add("Juan");

        Stream<String> valores = nombres.stream()
                .map((x) -> x.toUpperCase())
                .filter(x -> x.startsWith("P"));
        valores.forEach(x -> System.out.println(x));

        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        var stNumeros = Arrays.stream(numeros);
        //stNumeros.forEach(x-> System.out.println(x));
        var resultado = stNumeros.filter(x -> x % 2 == 0).reduce(0, (x,y) -> {
            System.out.println("X es " + x + " y es " + y);
            return x + y;
        });
        System.out.println(" mi suma de pasres es " + resultado);
        //stNumeros.filter(x -> x % 2 == 0);
    }
}
