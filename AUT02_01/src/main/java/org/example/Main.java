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
                salir = false;
            }else if (opcion == 2){
                salir = false;
            }else if (opcion == 3){
                salir = false;
            }else if (opcion == 4){
                salir = false;
            }else if (opcion == 5){
                salir = false;
            }else if (opcion == 6){
                salir = true;
            }else System.out.println("Opción no válida. Inténtalo de nuevo");
        }while(!salir);
    }
}