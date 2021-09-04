
package com.examen;

import java.util.Scanner;


public class Principal {

   
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
      
        System.out.print("Ingresa tu nombre: ");
       String nombre= leer.next();
        System.out.print("Ingresa tu edad: ");
       int edad=leer.nextInt();
        System.out.print("Ingresa tu sexo: ");
       char sexo=leer.next().toUpperCase().charAt(0);
        System.out.print("Ingresa tu peso: ");
       float peso=leer.nextFloat();
        System.out.print("Ingresa tu altura: ");
       float altura=leer.nextFloat();
       
        Persona persona=new Persona(nombre,edad,sexo,peso,altura);
        
        System.out.println(msgPeso(persona));
            System.out.println(esMayor(persona));
           System.out.println(persona);
    }
    
    public static String msgPeso(Persona persona){
   int imc= persona.calcularIMC();
   String mensaje="";
   switch(imc){
       case -1:
               mensaje="Esta por debajo de su peso ideal";
               break;
                case 0:
               mensaje="Esta en su peso ideal";
               break;
                 case 1:
               mensaje="Tiene sobrepeso";
               break;
   }
   return mensaje;
    }
    
    public static String esMayor(Persona persona){
    return (persona.esMayorDeEdad())?"La persona es mayor de edad":"La persona es menor de edad";
    }
}
