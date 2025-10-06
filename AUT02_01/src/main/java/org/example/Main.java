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
                        nombre = sc.nextLine();
                    }while (nombre.isEmpty());
                    boolean correcto = true;
                    boolean alfabetico = true;
                    do{
                        do{
                            for(int i = 0; i < nombre.length(); i++){
                                char letraActual = nombre.charAt(i);
                                if(!Character.isAlphabetic(letraActual)){
                                    correcto = false;
                                    alfabetico = false;
                                }
                            }
                            if(!correcto){
                                System.out.println("El nombre solo puede contener letras. Inténtalo de nuevo.");
                                System.out.print("Introduce nombre: ");
                                nombre = sc.nextLine();
                            }
                        } while (!alfabetico);
                        for (Estudiante listaEstudiante : listaEstudiantes) {
                            if (nombre.equals(listaEstudiante.getNombre())) {
                                correcto = false;
                            }
                        }
                        if(!correcto){
                            System.out.println("El nombre ya existe. Inténtalo de nuevo.");
                            System.out.print("Introduce nombre: ");
                            nombre = sc.nextLine();
                        }
                    }while (!correcto);
                    System.out.print("Introduce edad: ");
                    int edad = sc.nextInt();
                    do{
                        if (edad < 1){
                            System.out.println("La edad no puede ser menor que 1. Inténtalo de nuevo.");
                            System.out.print("Introduce edad: ");
                            edad = sc.nextInt();
                        }
                    }while(edad < 1);
                    System.out.print("Introduce nota media: ");
                    double nota = sc.nextDouble();
                    do{
                        if (nota < 0){
                            System.out.println("La nota no puede ser menor que 0. Inténtalo de nuevo.");
                            System.out.print("Introduce nota media: ");
                            nota = sc.nextDouble();
                        }
                    }while(nota < 0);
                    System.out.print("¿Está matriculado? (true/false): ");
                    boolean matriculado = sc.nextBoolean();
                    System.out.println();
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
                        nombre = sc.nextLine();
                    }while (nombre.isEmpty());
                    boolean encontrado = true;
                    for (Estudiante listaEstudiante : listaEstudiantes) {
                        if (listaEstudiante.getNombre().toLowerCase().contains(nombre.toLowerCase())) {
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