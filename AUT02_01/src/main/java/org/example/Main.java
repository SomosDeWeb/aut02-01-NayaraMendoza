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
                    String nombre = sc.next();
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
                    System.out.print("Introduce el nombre del estudiante a buscar: ");
                    String nombre = sc.next();
                    boolean encontrado = false;
                    for(int i = 0; i < listaEstudiantes.size(); i++){
                        if (nombre.equals(listaEstudiantes.get(i).getNombre())){
                            System.out.print("Aquí están los datos del estudiante introducido: ");
                            System.out.println(listaEstudiantes.get(i).toString());
                            encontrado = true;
                            break;
                        }else {
                            encontrado = false;
                        }
                    }
                    if (listaEstudiantes.isEmpty()){
                        encontrado = false;
                    }
                    if (!encontrado){
                        System.out.println("No se ha encontrado ningún estudiante con ese nombre.");
                    }
                    break;
                }
                case 4 -> {
                    double media = 0;
                    for(int i = 0; i < listaEstudiantes.size(); i++){
                        media += listaEstudiantes.get(i).getNota();
                    }
                    media /= listaEstudiantes.size();
                    System.out.println("\nAquí está la nota media de todos los estudiantes: " + media);
                    break;
                }
                case 5 -> {
                    break;
                }
                case 6 -> {
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                }
                default -> System.out.println("Opción no válida. Inténtalo de nuevo");
            }
        }while(!salir);
    }
}