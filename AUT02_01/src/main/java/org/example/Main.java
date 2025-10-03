package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        boolean salir = false;
        do{
            System.out.print("=== Gestor de estudiantes ===\n1. Añadir estudiante\n2. Listar estudiantes\n3. Buscar por nombre" +
                    "\n4. Calcular nota media general\n5. Mostrar mejor estudiante\n6. Salir\nSeleccione opcion: ");
            opcion = sc.nextInt();

            if (opcion == 1){

            }else if (opcion == 2){

            }else if (opcion == 3){

            }else if (opcion == 4){

            }else if (opcion == 5){

            }else if (opcion == 6){

            }else System.out.println("Opción no válida. Inténtalo de nuevo");
        }while(!salir);
        System.out.println("Saliendo del programa...");
    }
}