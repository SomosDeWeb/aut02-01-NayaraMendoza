package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        boolean salir = false;
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        do{
            System.out.print("=== Gestor de estudiantes ===\n1. Añadir estudiante\n2. Listar estudiantes\n3. Buscar por nombre" +
                    "\n4. Calcular nota media general\n5. Mostrar mejor estudiante\n6. Salir\nSeleccione opcion: ");
            opcion = sc.nextInt();
            System.out.println();
            switch (opcion) {
                case 1 -> {
                    System.out.print("Introduce nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Introduce edad: ");
                    int edad = sc.nextInt();
                    System.out.print("Introduce nota: ");
                    int nota = sc.nextInt();
                    System.out.print("¿Está matriculado? (true/false): ");
                    boolean matriculado = sc.nextBoolean();
                    listaEstudiantes.add(new Estudiante(nombre, edad, nota, matriculado));
                    System.out.println("Estudiante añadido correctamente.");
                    break;
                }
                case 2 -> {
                    System.out.println("Lista de estudiantes: ");
                    for(int i = 0; i < listaEstudiantes.size(); i++){
                        System.out.println(listaEstudiantes.get(i).toString());
                    }
                    System.out.println();
                    break;
                }
                case 3 -> {
                    break;
                }
                case 4 -> {
                    break;
                }
                case 5 -> {
                    break;
                }
                case 6 -> {
                    break;
                }
                default -> System.out.println("Opción no válida. Inténtalo de nuevo");
            }
        }while(!salir);
        System.out.println("Saliendo del programa...");
    }
}