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
public class Carro {
    private Ruedas[] rueda;
    private Chasis chasis;
    private Motor motor;
    private String marca;

    public Carro(Ruedas[] rued, String chasis, String motor, String marca) {
        
        this.rueda = rued;
        this.chasis = new Chasis(chasis);
        this.motor = new Motor(motor);
        this.marca = marca;
    }

    
    public Ruedas[] getRueda() {
        return rueda;
    }

    public void setRueda(Ruedas[] rueda) {
        this.rueda = rueda;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    
    
}
