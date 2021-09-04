
package com.examen;

public class Persona {
    private String nombre;
    private int edad;
    private String NSS;
    private char sexo;
    private float peso;
    private float altura;
    
    public Persona(String nombre, int edad, String NSS, char sexo, float peso, float altura){
    this.nombre = nombre;
    this.edad = edad;
    this.NSS = NSS;
    this.sexo = sexo;
    this.peso = peso;
    this.altura = altura;
    }

    public Persona(String nombre, int edad, char sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = (this.comprobarSexo(sexo))?sexo:'H';
        this.peso = peso;
        this.altura = altura;
        this.NSS=this.generarNSS();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
   public int calcularIMC(){
   double imc;
   int resultado=0;
   imc = (this.peso)/Math.pow(this.altura,2);
   
   if(this.sexo=='H'){
       if (imc < 20) {
           resultado = -1;
       } else if (imc >= 20 && imc <= 25) {
           resultado = 0;
       } else if (imc > 25) {
           resultado = 1;
       }
   }else if(this.sexo=='M'){
    if (imc < 19) {
           resultado = -1;
       } else if (imc >= 19 && imc <= 24) {
           resultado = 0;
       } else if (imc > 24) {
           resultado = 1;
       }
   }
   return resultado;
   }

   public boolean esMayorDeEdad(){
   return (this.edad >= 18);
   }
   
   private boolean comprobarSexo(char sexo){
   return (sexo == 'H' || sexo=='M');
   }
    
    @Override
   public String toString(){
   return ("Nombre: " + this.nombre + ", Edad: " + this.edad+", NSS:"+this.NSS+", Sexo: "+this.sexo+", Peso: "+this.peso+", Altura: "+this.altura);
   }
   
   private String generarNSS(){
       String nss="";
      
   for(int i=0;i<8;i++){
  
   if(Math.random()<0.5){
     nss=nss+this.generaNumeroAleatorio();
   }else{
           nss=nss+this.generarLetraAleatoria();
           }

   }
      return nss;
   }
   
   private int generaNumeroAleatorio(){
       int nAleatorio = (int)(Math.random()*10);
   
   return nAleatorio;
   }
   
   private char generarLetraAleatoria(){
   int nCaracter = (int) (Math.random()*26)+65;
   char letra=(char)nCaracter;
   return letra;
   }
}
