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
                    String nombre = "";
                    do{
                        nombre = sc.next();
                    }while (nombre.isEmpty());
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
                    String nombre = "";
                    do{
                        nombre = sc.next();
                    }while (nombre.isEmpty());
                    boolean encontrado = false;
                    for (Estudiante listaEstudiante : listaEstudiantes) {
                        if (nombre.equals(listaEstudiante.getNombre())) {
                            encontrado = true;
                            System.out.print("Aquí están los datos del estudiante introducido: ");
                            System.out.println(listaEstudiante.toString());
                            break;
                        } else {
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
                    for (Estudiante listaEstudiante : listaEstudiantes) {
                        media += listaEstudiante.getNota();
                    }
                    media /= listaEstudiantes.size();
                    System.out.println("\nAquí está la nota media de todos los estudiantes: " + media);
                    break;
                }
                case 5 -> {
                    double notaMayor = 0;
                    int estudiante = 0;
                    for(int i = 0; i < listaEstudiantes.size(); i++){
                        if (listaEstudiantes.get(i).getNota() > notaMayor){
                            notaMayor = listaEstudiantes.get(i).getNota();
                            estudiante = i;
                        }
                    }
                    System.out.println("\nEste es el estudiante con la mayor nota:\n" + listaEstudiantes.get(estudiante).toString());
                    System.out.println();
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