/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p1_nahimhilsaca;
import java.util.Scanner;

/**
 *
 * @author nahim
 */
public class Libro {
    
    static Scanner leer= new Scanner(System.in);
    private String titulo;
    private  String escritor;
    private int publicacion;
    
    public Libro(){
    }// Se ocupa siempre una clase vacia
    
    public Libro( String tituloT, String escritorE, int publicacionP){
    
        this.titulo=tituloT;// variable titulo con su parametro tituloT
        this.escritor=escritorE;// variable esceritor con su parametri escritorE
        this.publicacion=publicacionP;// variable publicacion con su parametro publicacionE
   
    }// Se ocupa siempre una clase llena
    
    public void settitulo(String titulo){
    this.titulo=titulo;
    
    }// Fin del settitulo
    
    public String gettitulo(){
    
    
    return titulo;
    }// Fin del metodo gettitulo
    
    public void setescritor( String escritor){
    
    this.escritor=escritor;
    
    }// Fin del metodo setescritor
    
    public String getescritor(){
    
    return escritor;
    
    }// Fin del metodo getescritor
    
    
    public void setpublicacion(int publicacion){
   
    this.publicacion=publicacion;
    
    }
    
    
    public int getpublicacion(){
    
    return publicacion;
    
    }
}// Fin de la clase Libro
