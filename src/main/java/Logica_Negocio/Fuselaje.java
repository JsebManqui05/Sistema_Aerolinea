/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author Sebastian Manquillo
 */
public class Fuselaje {

    //Declaracion de atributos
    public String Nombre;

    //Constructor no parametrizado
    public Fuselaje() {
    }

    //Constructor parametrizado
    public Fuselaje(String Nombre) {
        this.Nombre = Nombre;
    }

    //Seters and getters
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

}
