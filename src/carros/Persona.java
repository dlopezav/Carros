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
public class Persona {
    private String nombre;
    private String apellido;
    private Carro[] carros;
    private int z;

    public Persona(String nombre, String apellido, int cant) {
        this.nombre = nombre;
        this.apellido = apellido;
        if(cant>=2){
            this.carros = new Carro[cant];
        }else{
            System.out.println("No es una cantidad valida de carros ");
        }
        z=cant;
    }

    
    public Carro[] listaCarros(){
            return carros;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Carro[] getCarros() {
        return carros;
    }

    public void setCarros(Carro[] carros) {
        this.carros = carros;
    }
    
}
