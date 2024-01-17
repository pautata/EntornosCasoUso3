package EnCaso3;

import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la base del triángulo:");
        int base = scanner.nextInt();
        
        System.out.println("Ingrese la altura del triángulo:");
        int altura = scanner.nextInt();

        double areaTriangulo = calcularAreaTriangulo(base, altura);
        System.out.println("El área del triángulo es: " + areaTriangulo);

        scanner.close();
    }

    public static double calcularAreaTriangulo(int base, int altura) {
        return (base * altura) / 2.0;
    }
}