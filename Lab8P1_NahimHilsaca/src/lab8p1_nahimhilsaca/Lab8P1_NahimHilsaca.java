/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8p1_nahimhilsaca;

import java.util.Scanner;

/**
 *
 * @author nahim
 */
public class Lab8P1_NahimHilsaca {

    /**
     * @param args the command line arguments
     */
    static Scanner leer = new Scanner(System.in);// Variable global del Scanner para Strings
    static Scanner read = new Scanner(System.in);// Variable global del Scanner para enteros

    public static void main(String[] args) {
        boolean val= false; // Para validar si el usario ingresa priemro el 2 
        boolean opcion = true;// Para validar si el usuario ingresa 3, cierra el program
        Libro[][] mate = null; // Para inicializar la matriz Libro para luego ser asignada a sus metoddo correspondientes

        while (opcion) {

            System.out.println("Menu");
            System.out.println("1. Crear biblioteca");
            System.out.println("2. Modificar Librero");
            System.out.println("3. Salir");
            int op = read.nextInt();

            switch (op) {

                case 1: {
                   mate = llenarLibrero();
                   imprimirLibreria(mate);
                   val = true; 
                }
                break;

                case 2:
                    
                    if (val == true){
                    System.out.print("Ingrese el titulo del libro: ");
                    String tito = leer.nextLine();

                    System.out.print("Ingrese el escritor del lbro: ");
                    String escrit = leer.nextLine();

                    System.out.print("Ingrese la fecha de publicacion: ");
                    int publi = read.nextInt();

                    mate = ModificarLibro(tito, escrit, publi, mate);
                    imprimirLibreria(mate);

                    }
                    
                    else{
                    
                        System.out.println("Tiene que ingresar primero el 1 y despues el 2");

                    }
                    
                    break;

                case 3:
                    opcion = false;
                    break;

                default:
                    System.out.println("Opcion incorrecta. Hay que elegir de las opciones dadas ");
                    break;

            }// Fin del switch

        }// Fin del while

    }// Fin del metodo main

    public static Libro[][] llenarLibrero() {

        System.out.println("Ingrese la cantidad de filas para el librero: ");
        int filas = read.nextInt();
        System.out.println("Ingrese la cantidad de columnas para el librero ");
        int columnas = read.nextInt();

        while(filas <= 0 || columnas <= 0) {

            System.out.println("Sus filas y columnas no pueden ser igual a cero o menos");
            System.out.println("Ingrese la cantidad de filas para el librero: ");
         filas = read.nextInt();
        System.out.println("Ingrese la cantidad de columnas para el librero ");
         columnas = read.nextInt();
        }//Fin del while
        
        Libro[][] libreria = new Libro[filas][columnas];

        for (int i = 0; i < libreria.length; i++) {

            for (int j = 0; j < libreria[i].length; j++) {
                    
                System.out.print("Ingrese el titulo del libro: ");

                String titulo = leer.nextLine();

                System.out.print("Ingrese el escritor: ");
                String escritor = leer.nextLine();

                System.out.print("Ingrese la fecha de publicacion: ");
                int publicacion = read.nextInt();

                Libro L = new Libro(titulo, escritor, publicacion); // Instanciacion de mi clase Libro; parametros como variables

                libreria[i][j] = L;
                
                System.out.println("El libro fue agregado exitosamente ");
                System.out.println();
            }// Fin del for j
        }// Fin del for i

        return libreria;
    }// Fin del metodo 

    public static void imprimirLibreria(Libro[][] libreria) {

        System.out.println("El librero completo es: ");
        System.out.println();
        for (int i = 0; i < libreria.length; i++) {
            for (int j = 0; j < libreria[i].length; j++) {

                System.out.print("[" + libreria[i][j].gettitulo() + "]");

            }// Fin del for j
            System.out.println();
        }// Fin del for i 

    }// Fin del metodo imprimirLibreria

    public static Libro[][] ModificarLibro(String titulo, String escritor, int publicacion, Libro[][] libreria) {
            boolean libro=false;
        for (int i = 0; i < libreria.length; i++) {
            for (int j = 0; j < libreria[i].length; j++) {

                Libro L = libreria[i][j];

                if (titulo.equals(libreria[i][j].gettitulo()) & escritor.equals(libreria[i][j].getescritor()) && publicacion == libreria[i][j].getpublicacion()) {
                        libro=true;
                    System.out.println("El libro esta en la fila " + (i+1) + " en la columna " +  (j+1) );
                    System.out.println();
                    System.out.print("Ingrese el titulo del libro: ");
                    titulo = leer.nextLine();

                    System.out.print("Ingrese el escritor del libro: ");
                    escritor = leer.nextLine();

                    System.out.print("Ingrese la fecha de publicacion: ");
                    publicacion = read.nextInt();

                    libreria[i][j].settitulo(titulo);
                    libreria[i][j].setescritor(escritor);
                    libreria[i][j].setpublicacion(publicacion);

                } 

            }// Fin del for j
        }// Fin del for i 
        if (libro==false){

                    System.out.println("El libro no fue encontrado ");
                }
        return libreria;
    }// Fin del metodo ModificarLibro

}// Fin de la clase
