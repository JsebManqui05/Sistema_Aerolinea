/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author Sebastian Manquillo
 */
public class Llanta {

    //Declaracion de atributos
    public String Tamaño_Llanta;

    //Constructor no parametrizado
    public Llanta() {
    }

    //Constructor parametrizado
    public Llanta(String Tamaño_Llanta) {
        this.Tamaño_Llanta = Tamaño_Llanta;
    }

    //Setters and getters
    public String getTamaño_Llanta() {
        return Tamaño_Llanta;
    }

    public void setTamaño_Llanta(String Tamaño_Llanta) {
        this.Tamaño_Llanta = Tamaño_Llanta;
    }

}
