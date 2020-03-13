
package colperros.principal;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author Santiago Velasquez, Mario Dorado y Jeimmy Naranjo
 */
public class principal {
    static List<Perro> perros = new LinkedList<>();
    static Scanner teclado = new Scanner (System.in);
    
    
    public static void main(String[] args){
    
    
    int opcion;
    
    do{
        System.out.println("1. Agregar Nuevo Perro");
        System.out.println("2. Listar perros");
        System.out.println("3. Listar informacion por perro");
        System.out.println("4. Listar Perros por Localidad");
        System.out.println("5. Listar Perros por Raza");
        System.out.println("0. Salir");
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
            cont++;
            }
           
        }
        
        if(cont == 0)
        {
        System.out.println("No existe perro con el nombre: " + perrob);
        }
        else{
            
        }
        
    }

    private static void perrosLocalidad() {
        teclado.nextLine();
        System.out.println(" Localidad a buscar: ");
        String localidad = teclado.nextLine();
        int cont = 0;
        for (Perro i: perros){
            
            if (i.getLocalidad().equalsIgnoreCase(localidad) ){
                String nombrep = perros.get(cont).getNombre();
            System.out.println(nombrep);
            cont++;
            }
           
        }
        
        if(cont == 0)
        {
        System.out.println("No existe perro con el nombre: " + localidad);
        }
        else{
            
        }
         
        }

    private static void perrosRaza() {
        
        teclado.nextLine();
        System.out.println(" Raza del perro a buscar: ");
        String raza = teclado.nextLine();
        int cont = 0;
        for (Perro i: perros){
            
            if (i.getRaza().equalsIgnoreCase(raza) ){
                cont = cont + 1;
        
            }
           
        }
        
        
        if(cont == 0)
        {
        System.out.println("No existen perros de la raza: " + raza  );
        }
        else{
            System.out.println(" Hay " + cont + " perros de la raza " + raza);
        }
       
    }
}

      
        
        
    
    
        
     

