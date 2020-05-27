package Getsetbueno;
import java.util.Scanner;

public class Principal {

   
    public static void main(String[] args) {
     int j=0;
     int supr;
    String nom;
String ape;
int edad;
String nom2;
String ape2;
int edad2;
String nom3;
String ape3;
int edad3;
String nom4;
String ape4;
int edad4;
String nom5;
String ape5;
int edad5;
     Scanner entrada=new Scanner(System.in);
     Empleado emp1=new Empleado();
     Empleado emp2=new Empleado();
     Empleado emp3=new Empleado();
     Empleado emp4=new Empleado();
     Empleado emp5=new Empleado();
     
     int opcion=0,opc;
     do{
     System.out.println("Seleccione lo que desea hacer");
     System.out.println("[1]Ingresar Empleados");
     System.out.println("[2]Modificar algun Empleado ya ingresado");
     System.out.println("[3]Ver Empleados Registrados");
     opc=entrada.nextInt();
     switch(opc){ 
         
         case 1:   
     System.out.println("Ingrese los Datos del primer Empleado "+j);
     System.out.println("Nombre: ");
     nom=entrada.nextLine();
     nom=entrada.nextLine();
     System.out.println("Apellido: ");
     ape=entrada.nextLine();
     System.out.println("Edad: ");
     edad=entrada.nextInt();
     emp1.setNombre(nom);
     emp1.setApellido(ape);
     emp1.setEdad(edad);

     j++;
     System.out.println("Ingrese los Datos del segundo Empleado "+j);
     System.out.println("Nombre: ");
     nom2=entrada.nextLine();
      nom2=entrada.nextLine();
     System.out.println("Apellido: ");
     ape2=entrada.nextLine();
     System.out.println("Edad: ");
     edad2=entrada.nextInt();
     emp2.setNombre2(nom2);
     emp2.setApellido2(ape2);
     emp2.setEdad2(edad2);
     j++;
     
     
     System.out.println("Ingrese los Datos del tercer Empleado "+j);
     System.out.println("Nombre: ");
     nom3=entrada.nextLine();
     nom3=entrada.nextLine();
     System.out.println("Apellido: ");
     ape3=entrada.nextLine();
     System.out.println("Edad: ");
     edad3=entrada.nextInt();
     emp3.setNombre3(nom3);
     emp3.setApellido3(ape3);
     emp3.setEdad3(edad3);
     j++;
     
     
     System.out.println("Ingrese los Datos del cuarto Empleado "+j);
     System.out.println("Nombre: ");
     nom4=entrada.nextLine();
     nom4=entrada.nextLine();
     System.out.println("Apellido: ");
     ape4=entrada.nextLine();
     System.out.println("Edad: ");
     edad4=entrada.nextInt();
     emp4.setNombre4(nom4);
     emp4.setApellido4(ape4);
     emp4.setEdad4(edad4);
     j++;
     
     
     System.out.println("Ingrese los Datos del quinto Empleado "+j);
     System.out.println("Nombre: ");
     nom5=entrada.nextLine();
     nom5=entrada.nextLine();
     System.out.println("Apellido: ");
     ape5=entrada.nextLine();
     System.out.println("Edad: ");
     edad5=entrada.nextInt();
     emp5.setNombre5(nom5);
     emp5.setApellido5(ape5);
     emp5.setEdad5(edad5);
     j++;
     
     System.out.println("Desea hacer otra accion\n");
     System.out.println("1.-Si\t\t"+"2.-No");
     opcion=entrada.nextInt();
     break;
     
         case 2:
     System.out.println("¿Que empleado desea modificar?");
     System.out.println(" [1] ");
      System.out.println(" [2] ");
       System.out.println(" [3] ");
        System.out.println(" [4] ");
         System.out.println(" [5] ");
        int sele = entrada.nextInt();
     
         switch (sele){
             
             case 1:
               System.out.println("Ingrese los datos de la modificacion");
     System.out.println("Nuevo Nombre: ");
     nom=entrada.nextLine();
     nom=entrada.nextLine();
     System.out.println("Nuevo Apellido: ");
     ape=entrada.nextLine();
     System.out.println("Edad: ");
     edad=entrada.nextInt();
     emp1.setNombre(nom);
     emp1.setApellido(ape);
     emp1.setEdad(edad);
            break;     
             case 2:
         System.out.println("Ingrese los datos de la modificacion");
     System.out.println("Nuevo Nombre: ");
     nom=entrada.nextLine();
     nom=entrada.nextLine();
     System.out.println("Nuevo Apellido: ");
     ape=entrada.nextLine();
     System.out.println("Edad: ");
     edad=entrada.nextInt();
     emp2.setNombre(nom);
     emp2.setApellido(ape);
     emp2.setEdad(edad);
         break;
           case 3: 
         System.out.println("Ingrese los datos de la modificacion");
     System.out.println("Nuevo Nombre: ");
     nom=entrada.nextLine();
     nom=entrada.nextLine();
     System.out.println("Nuevo Apellido: ");
     ape=entrada.nextLine();
     System.out.println("Edad: ");
     edad=entrada.nextInt();
     emp3.setNombre(nom);
     emp3.setApellido(ape);
     emp3.setEdad(edad);
         break;
          case 4:
         System.out.println("Ingrese los datos de la modificacion");
     System.out.println("Nuevo Nombre: ");
     nom=entrada.nextLine();
     nom=entrada.nextLine();
     System.out.println("Nuevo Apellido: ");
     ape=entrada.nextLine();
     System.out.println("Edad: ");
     edad=entrada.nextInt();
     emp4.setNombre(nom);
     emp4.setApellido(ape);
     emp4.setEdad(edad);
          break;

          case 5:
         System.out.println("Ingrese los datos de la modificacion");
     System.out.println("Nuevo Nombre: ");
     nom=entrada.nextLine();
     nom=entrada.nextLine();
     System.out.println("Nuevo Apellido: ");
     ape=entrada.nextLine();
     System.out.println("Edad: ");
     edad=entrada.nextInt();
     emp5.setNombre(nom);
     emp5.setApellido(ape);
     emp5.setEdad(edad);
           break;
     
      }
     
     
         break;                                                                                                                                
     
         case 3:
      
        emp1.mensaje();
        emp2.mensaje2();
        emp3.mensaje3();
        emp4.mensaje4();
        emp5.mensaje5();
    
     System.out.println("Desea hacer otra accion\n");
     System.out.println("1.-Si\t\t"+"2.-No");
     opcion=entrada.nextInt();
         break;
     }
     }while(opcion==1); 
        
    }
    
}
