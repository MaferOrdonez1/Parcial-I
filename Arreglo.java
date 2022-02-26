/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamiento;

import java.util.Scanner;

/**
 *
 * @author mafer
 */
class Arreglo {
    int num = 11;
    Scanner sc = new Scanner(System.in);
    int arreglo[] = new int[num];
    
    public void Ingresar(){
        for(int i=0; i<num;i++)
        {
            System.out.println("Ingrese numero "+i+":");
            arreglo[i] =sc.nextInt();        
        
        }
    }
    public void Mostrar(){
        for(int i=0; i<num;i++)
        {
            System.out.println("Indice("+ i +")"+"valor("+ arreglo[i] +")");
        }
    }
    public void ascendente(){
        for (int i=0; i<=num-2;i++){
            for(int x=i+1;x<num;x++){
                    if (arreglo[i]>arreglo[x]){
                        int p = arreglo[i];
                        arreglo[i] = arreglo [x];
                        arreglo[x]= p;
                }        
            }            
        }    
        for(int i=0; i<num;i++){
            System.out.println("Indice("+ i +")"+"valor("+ arreglo[i] +")");
        }
    }
    public void descendente(){
        for (int i=0; i<=num-2;i++){
            for(int x=i+1;x<num;x++){
                    if (arreglo[i]<arreglo[x]){
                        int p = arreglo[i];
                        arreglo[i] = arreglo [x];
                        arreglo[x]= p;
                }        
            }            
        }
        for(int i=0; i<num;i++){
            System.out.println("Indice("+ i +")"+"valor("+ arreglo[i] +")");
        }
    }
}