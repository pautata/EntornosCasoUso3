package EnCaso3;

import java.util.Scanner;

public class Caso3 {

	public static Scanner scanner = new Scanner(System.in);
	
    public static void main(String[] args) {

        System.out.println("Seleccione una operación:");
        System.out.println("1. Área de un triángulo");
        System.out.println("2. Área y perímetro de una circunferencia");
        System.out.println("3. Área de un cilindro");
        System.out.println("4. Área de un rectángulo");
        System.out.println("5. Volumen de un cubo");
        System.out.println("6. Área de un cubo");
    
        System.out.print("Ingrese el número de la operación deseada: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                triangulo();
                break;
            case 2:
                area_perimetro_circunferencia();
                break;
            case 3:
            	area_cilindro();
                break;
            case 4:
            	area_rectangulo();
                break;
            case 5:
                volumen_cubo();
                break;
            case 6:
            	area_cubo();
                break;
            default:
                System.out.println("Error: Opción no válida.");
        }
    }

  
    public static void triangulo() {
    	Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la base del triángulo:");
        double base = scanner.nextInt();
        
        System.out.println("Ingrese la altura del triángulo:");
        double altura = scanner.nextInt();
        
        double area = (base * altura) / 2.0;

        System.out.println("El área del triángulo es: " + area);
    }

    public static void area_circunferencia() {
        
    }

    public static void area_perimetro_circunferencia() {
   
    }
    
    public static void area_cilindro() {
    	   
    }
    
    public static void area_rectangulo() {

    }
    public static void volumen_cubo() {
  
    }
    public static void area_cubo() {
 
    }

}
