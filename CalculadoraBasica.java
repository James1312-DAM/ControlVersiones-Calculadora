import java.util.Scanner;

public class CalculadoraBasica {

    public static int multiplicacion(int a, int b) {
        return a * b;
    }
   public static int suma(int a, int b) {
        return a + b;
    }
   public static int resta(int a, int b) {
        return a - b;
    }

    public static double division(int a, int b) {
        if (b == 0) {
            System.out.println("Error: no se puede dividir entre 0");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        int num1 = sc.nextInt();

        System.out.println("Introduce el segundo número:");
        int num2 = sc.nextInt();

        System.out.println("Multiplicación: " + multiplicacion(num1, num2));
        System.out.println("División: " + division(num1, num2));
      System.out.println("Suma: " + suma(num1, num2));
        System.out.println("Resta: " + resta(num1, num2));

        sc.close();
    }
}






   

   

   