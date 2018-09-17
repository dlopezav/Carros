/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carros;

/**
 *
 * @author Estudiante
 */
public class Carros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            //Nombre, Apellido y Cantidad de autos
            
            Ruedas[] rueda = new Ruedas[4];
            for(int i=0;i<4;i++){
            rueda[1]= new Ruedas("400");
            }
            Persona persona1= new Persona("Diego", "Lopez", 8);
            Carro carro1 = new Carro(rueda,"chasis", "2500", "Ford");
            
            Carro[] Car=persona1.listaCarros();
            for (int i = 0; i<1 ;i++) {
                System.out.println("Carro #"+i+" Chasis:"+ Car[i].getChasis().getTipo()+ " Motor:"+Car[i].getMotor()+ " Ruedas: "+Car[i].getRueda()[1].getTipo());
            }
        }
            
            
            
 }
    

