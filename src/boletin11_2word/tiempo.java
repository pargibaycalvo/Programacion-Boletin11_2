/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11_2word;

import java.util.Calendar;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Ped90
 */
public class tiempo {
        private long time1, time2, diferencia; //ponemos en privado long los atributos
        String cad;
        Scanner teclado = new Scanner (System.in); 
        
                
public tiempo() { //constructor sin parametros    
    }       


public void cronometro(){
    
        Calendar ya1 = Calendar.getInstance();
        time1 = ya1.getTimeInMillis();  //se toma el tiempo de inicio del juego
        
        System.out.println ("ESCRIBE A SEGUINTE FRASE: " //le decimos que nos diga la frase que tenemos que escribir
                + "A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática. ");
        
        System.out.println ("PULSA ACEPTAR PARA TERMINAR: "); //mensaje 
        cad = teclado.nextLine(); //se espera a que el usuario acepte
        
        Calendar ya2 = Calendar.getInstance();
        time2 = ya2.getTimeInMillis();  //se toma el tiempo de final del juego
        
        diferencia = time2 - time1;
         
        System.out.println("TARDASTE: " +diferencia+ " milisegundos EN ESCRIBIR LA FRASE, ¡LENTO! "); //mensaje con el resultado final
        
        }
        
        
        
        
    
            }
        
        
       
        
    
        
    
    

          
    
 
   

    
        
    
 

