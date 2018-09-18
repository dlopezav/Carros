/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carros;
import java.util.Scanner;
/**
 *
 * @author Estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
            Scanner scan = new Scanner(System.in);
            Ruedas[] rueda = new Ruedas[4];
            System.out.println("Ingrese nombre de la persona");
            String o = scan.next();
            System.out.println("Ingrese apellido de la persona: ");
            String m = scan.next();
            int q;
            do{
            System.out.println("Ingrese la cantidad de autos de la persona: ");
            q = scan.nextInt();
            if(q<2){
                System.out.println("No es una cantidad válida de autos");
            }
            }while(q<2);
            
            
            for(int i=0;i<4;i++){
            rueda[i]= new Ruedas("LX00");
            }
            
            Persona persona1= new Persona(o, m, q);
            Carro carro1 = new Carro(rueda,"chasis", "2500", "Ford");
            Carro carro2 = new Carro(rueda,"chas", "4300", "Chevrolet");
            Carro carro3 = new Carro(rueda,"chas", "4300", "KIA");
            persona1.setCarros(carro1);
            persona1.setCarros(carro2);
            persona1.setCarros(carro3);
             
            Carro[] CarP1=persona1.listaCarros();
            
            for (int i = 0; i<persona1.getnumCarros() ;i++) { 
                System.out.println("Auto #"+i+" Marca: " +CarP1[i].getMarca()+ " Motor: "+CarP1[i].getMotor() );
                
            }
        }
}
            
            
            
 
    

