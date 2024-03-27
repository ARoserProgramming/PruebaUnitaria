package testUnitario;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int opcion;

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        numero1 = scan.nextInt();

        System.out.println("Ingrese el segundo número:");
        numero2 = scan.nextInt();

        System.out.println("Seleccione la operación: \n 1. Suma \n 2. Resta \n 3. Multiplicación \n 4. División");
        opcion = scan.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + sumar(numero1, numero2));
                break;
            case 2:
                System.out.println("La resta de " + numero1 + " y " + numero2 + " es: " + restar(numero1, numero2));
                break;
            case 3:
                System.out.println("La multiplicación de " + numero1 + " y " + numero2 + " es: " + multiplicar(numero1, numero2));
                break;
            case 4:
                if (numero2 == 0) {
                    System.out.println("No se puede dividir por cero");
                } else {
                    System.out.println("La división de " + numero1 + " y " + numero2 + " es: " + dividir(numero1, numero2));
                }
                break;
            default:
                System.out.println("Opción inválida");
        }
    }

    // Método para sumar dos números
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Método para restar dos números
    public static int restar(int a, int b) {
        return a - b;
    }

    // Método para multiplicar dos números
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    // Método para dividir dos números
    public static double dividir(int a, int b) {
        return (double) a / b;
    }
}
