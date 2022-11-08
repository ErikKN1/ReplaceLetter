/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.replaceletter;


import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Erik
 */
public class ReplaceLetter {

    public static void main(String[] args){
        // String text= "La lluvia en Sevilla es una maravilla";
        String text,texto2,texto3;
        char caracter,caracter2;
        Scanner InDate=new Scanner(System.in);
        
        String Option=JOptionPane.showInputDialog("Programa que modifica la letra de un texto por otra \t \n ¿Desea seguir de manera grafica? Y / N");
        if("Y".equals(Option)){
            text = JOptionPane.showInputDialog("Ingresa la frase inicial");
            texto2 = JOptionPane.showInputDialog("Que letra deseas cambiar");
            caracter=texto2.charAt(0);
            texto3 = JOptionPane.showInputDialog("Por que letra deseas cambiarla");
            caracter2=texto3.charAt(0);
            JOptionPane.showMessageDialog(null, "EL texto modificado es : "+text.replace(caracter, caracter2));
            
        }else{
             
            System.out.println("Ingresa la frase inicial");
            text=InDate.nextLine();
            System.out.println("Que letra deseas cambiar");
            caracter = InDate.next().charAt(0);
            System.out.println("Por que letra deseas cambiarla");
            caracter2 = InDate.next().charAt(0); 
             System.out.println(text.replace(caracter, caracter2));
            
        } 
        
    }
    
}
