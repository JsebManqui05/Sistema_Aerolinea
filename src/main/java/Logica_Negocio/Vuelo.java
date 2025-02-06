/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

import java.util.ArrayList;

/**
 *
 * @author Sebastian Manquillo
 */
public class Vuelo {

    //  Declaracion de atributos
    public String Aerolinea;
    public Avion objavion;
    public Pasajero objpasajero;
    public int Id_Vuelo;

    //Constructor no parametrizado
    public Vuelo() {
    }

    //Constuctor parametrizado
    public Vuelo(String Aerolinea, Avion objavion, Pasajero objpasajero, int Id_Vuelo) {
        this.Aerolinea = Aerolinea;
        this.objavion = objavion;
        this.objpasajero = objpasajero;
        this.Id_Vuelo = Id_Vuelo;
    }

    //Setters ang getters
    public String getAerolinea() {
        return Aerolinea;
    }

    public void setAerolinea(String Aerolinea) {
        this.Aerolinea = Aerolinea;
    }

    public Avion getObjavion() {
        return objavion;
    }

    public void setObjavion(Avion objavion) {
        this.objavion = objavion;
    }

    public Pasajero getObjpasajero() {
        return objpasajero;
    }

    public void setObjpasajero(Pasajero objpasajero) {
        this.objpasajero = objpasajero;
    }

    public int getId_Vuelo() {
        return Id_Vuelo;
    }

    public void setId_Vuelo(int Id_Vuelo) {
        this.Id_Vuelo = Id_Vuelo;
    }

}
