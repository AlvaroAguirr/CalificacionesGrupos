/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package califgrupos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ashkh
 */
public class Califgrupos {
    
  public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
  public static String entrada; 

  
  public static double[] leerCalif(int n) throws IOException{
      
      double[] califs = new double[n];
      for(int i=0; i<n; i++){
                System.out.println(" Escriba las calificaciones del alumno con el id ["+i+"]" );
                entrada= bufer.readLine();
                califs[i]= Double.parseDouble(entrada);
      }
      return califs;    
  }
    public static double calcularPromedioGrupo(double[] proms){
      double suma=0;
      for(int i=0; i <proms.length;i++)
          suma=suma+proms[i];
        /*
        for(double prom:proms)
          suma=suma+prom;       
        */        
      return suma/proms.length;
      
  }
      public static void imprimirCalif(double[] califs){
      int i=0;
      System.out.println("los Promedioos individuales del grupo son ");
      System.out.println("id alumno     promedio indivual");
      System.out.println("++++++++++++++++++++++++++++++++++");
      for(double ca:califs){
          System.out.println(" "+i+"           "+ca);
         i++;
      }
    
  }
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int t;    
        double promGrupo;
        
        double[] calificaciones= new double[5];
        
        double[] grupo1;
        double[] grupo2;
        double[] grupo3;
        double[] grupo4;
        double[] grupo5;
          
        System.out.println("ingresa la cantidad de alumnos del grupo 1");
        entrada=bufer.readLine();
        t= Integer.parseInt(entrada);
        grupo1= leerCalif(t);
        promGrupo=calcularPromedioGrupo(grupo1);
       calificaciones[0]=promGrupo;
       System.out.println("promedio del grupo1 es "+promGrupo);
        System.out.println("\n,\n");
        
                System.out.println("ingresa la cantidad de alumnos del grupo 2");
        entrada=bufer.readLine();
        t= Integer.parseInt(entrada);
        grupo2= leerCalif(t);
        promGrupo=calcularPromedioGrupo(grupo2);
         calificaciones[1]=promGrupo;
         System.out.println("promedio del grupo2 es "+promGrupo);
          System.out.println("\n,\n");
           
        
                System.out.println("ingresa la cantidad de alumnos del grupo 3");
        entrada=bufer.readLine();
        t= Integer.parseInt(entrada);
        grupo3= leerCalif(t);
        promGrupo=calcularPromedioGrupo(grupo3);
        System.out.println("promedio del grupo3 es "+promGrupo);
         calificaciones[2]=promGrupo;
          System.out.println("\n,\n");
           
        
                System.out.println("ingresa la cantidad de alumnos del grupo 4");
        entrada=bufer.readLine();
        t= Integer.parseInt(entrada);
        grupo4= leerCalif(t);
        promGrupo=calcularPromedioGrupo(grupo4);
        System.out.println("promedio del grupo4 es "+promGrupo);
         calificaciones[3]=promGrupo;
          System.out.println("\n,\n");
         
        
                System.out.println("ingresa la cantidad de alumnos del grupo 5");
        entrada=bufer.readLine();
        t= Integer.parseInt(entrada);
        grupo5= leerCalif(t);
        promGrupo=calcularPromedioGrupo(grupo5);
        System.out.println("promedio del grupo5 es "+promGrupo);
         calificaciones[4]=promGrupo;
          System.out.println("\n,\n");
       
        promGrupo=calcularPromedioGrupo(calificaciones);
        System.out.println("el resultado es del promedio total es  "+promGrupo);
      
    }
    
}
