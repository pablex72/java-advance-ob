import java.util.stream.IntStream;

public class Recursiva {
    public static void main(String[] args) {

        suma(5);
        System.out.println("Suma funcional: " + sumaFuncional(5));

        //factorials
        System.out.println("Factoril iterativa " + factorial(5));
        System.out.println("Factoril recursiva " + factorialRecusivo(5));
        System.out.println("Factoril funcional " + factorialFuncional(5));
    }
    public static int factorial(int numero){
        int resultado =1;
        for (int i = 1; i <= numero ; i++){
            resultado *= i;
        }
        return resultado;
    }

    public static int factorialRecusivo(int numero){
        if(numero == 0) return 1;
        return numero * factorialRecusivo(numero - 1);
    }

    public static int factorialFuncional(int numero){
        return IntStream.rangeClosed(1, numero)
                .reduce(1,(a,b) -> a * b);
    }

        public static int sumaRecursiva(int numero){
            if(numero == 1) return 1;
            return numero + sumaRecursiva(numero-1);
        }

        public static int suma(int max){
            int resultado = 0;

            for(int i=0; i<=max; i++){
                //resultado = resultado + 1;
                resultado += 1;
            }
            return resultado;
        }
/*
Funcional way
 */
        public static int sumaFuncional(int numero){
        return IntStream.rangeClosed(1, 5)
                .reduce(0, (a,b) -> a + b);
        }
}
