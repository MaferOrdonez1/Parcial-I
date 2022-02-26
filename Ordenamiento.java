/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenamiento;

import java.util.Scanner;

/**
 *
 * @author mafer
 */
public class Ordenamiento {


    public void menu(){

        boolean salir = false;
        int opcion;
    
        Scanner leer = new Scanner(System.in);
        Arreglo usuario = new Arreglo();
        
        while(!salir){
            
           System.out.println("1. Ingresar 10 numeros");
           System.out.println("2. Mostrar valores 2");
           System.out.println("3. Mostrar ordenamiento ascendente 3");
           System.out.println("4. Mostrar ordenamiento descendente 4");
           System.out.println("5. Salir");
           System.out.println("Escribe una de las opciones:");
           opcion = leer.nextInt();
           
           switch(opcion){
               case 1:
                   System.out.println("----------------- Ingresar 10 numeros -----------------");
                   usuario.Ingresar();
                   break;
               case 2:
                   System.out.println("----------------- Mostrar valores -----------------");
                   usuario.Mostrar();
                   break;
                case 3:
                   System.out.println("----------------- Mostrar ordenamiento ascendente -----------------");
                   usuario.ascendente();
                   break;
                case 4:
                   System.out.println("----------------- Mostrar ordenamiento descendente -----------------");
                   usuario.descendente();
                   break;      
                case 5:
                   salir=true;
                   System.out.println("Programa terminado");
                   break;
                default:
                   System.out.println("Solo números entre 1 y 4");
           }   
        }
    }
    public static void main(String[] args) {
        Ordenamiento list = new Ordenamiento();
        list.menu();
        
    }        
}
