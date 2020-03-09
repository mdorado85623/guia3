
package colperros.principal;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author 
 */
public class principal {
    static List<Perro> perros = new LinkedList<>();
    static Scanner teclado = new Scanner (System.in);
    
    
    public static void main(String[] args){
    
    
    int opcion;
    
    do{
        System.out.println("1. Agregar Nuevo Perro");
        System.out.println("2. Listar perros");
        System.out.println("3. Listar Perros por Localidad");
        System.out.println("4. Listar Perros por Raza");
        System.out.println("5. Salir");
        System.out.println("Opcion:");
        opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                agregarPerro();
                break;
                
            case 2:
                listarPerros();
                break;
            
            case 3:
                InfxPerro();
                break;    
                         
            case 4:
                perrosLocalidad();
                break;
                
            case 5:
                perrosRaza();
                break;
                
            
            case 6:
                salir();
                break;
        }
                  
    }
    
    while (opcion !=0);
    }
     private static void agregarPerro(){
         teclado.nextLine();
         System.out.println("Nombre de perro: ");
         String nom = teclado.nextLine();
         System.out.println("Raza del perro: ");
         String raz = teclado.nextLine();
         System.out.println("Localidad : ");
         String loc = teclado.nextLine();
         System.out.println("Cedula del dueño :");
         int ced = teclado.nextInt();
         teclado.nextLine();
         System.out.println("Nombre del Dueño :");
         String nomd = teclado.nextLine();
         System.out.println("Telefono del dueño :");
         int teld = teclado.nextInt();
         teclado.nextLine();
         System.out.println("Dia de asistencia :");
         String dia = teclado.nextLine();
         teclado.nextLine();
         
        Perro perro = new Perro(nom, raz, loc, ced, nomd, teld, dia);
        
        perros.add(perro);
        System.out.println(perro);
        System.out.println("Nuevo perro añadido");
        
        
    }
     private static void listarPerros(){
         System.out.println("Lista de Perros: ");
         
        for  (Perro c : perros){
            System.out.println(c);
            
        }
        
        
     }    

    private static void InfxPerro() {
        teclado.nextLine();
        System.out.println("Perro a buscar: ");
        String perrob = teclado.nextLine();
        
        int cont = 0;
        for (Perro i: perros){
            if (i.getNombre().equalsIgnoreCase(perrob) ){
            System.out.println(i);
            }
        }
        if (cont == 0);{
        System.out.println("No existe perro con el nombre: " + perrob);
    }
     
            
                }

    private static void perrosLocalidad() {
        
    }
    }
        
     

