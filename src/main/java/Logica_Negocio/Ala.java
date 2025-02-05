/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author Sebastian Manquillo
 */
public class Ala {

    //Declaracion de atributos
    public String Posicion;

    //Constructor no parametrizado
    public Ala() {
    }

    //Constructor parametrizado
    public Ala(String Posicion) {
        this.Posicion = Posicion;
    }

    //Setters and getters
    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }

}
