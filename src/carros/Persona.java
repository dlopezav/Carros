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
    private int numCarros;

    public Persona(String nombre, String apellido, int cant) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carros = new Carro[cant];
        this.numCarros=cant;
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

    public void setCarros(Carro carros) {
        for (int i = 0; i < numCarros; i++) {
            if(this.carros[i]==null){
                this.carros[i] = carros;
            i=numCarros;
            }
        }
    }
    public int getnumCarros(){
        return numCarros;
    }    
        
    }
