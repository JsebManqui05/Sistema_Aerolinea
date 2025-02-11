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
    public Fecha objfecha;
    public Pasajero objpasajero;
    public String Id_Vuelo;

    //Constructor no parametrizado
    public Vuelo() {
    }

    //Constuctor parametrizado
    public Vuelo(String Aerolinea, Avion objavion, Fecha objfecha, Pasajero objpasajero, String Id_Vuelo) {
        this.Aerolinea = Aerolinea;
        this.objavion = objavion;
        this.objfecha = objfecha;
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

    public Fecha getObjfecha() {
        return objfecha;
    }

    public void setObjfecha(Fecha objfecha) {
        this.objfecha = objfecha;
    }

    public Pasajero getObjpasajero() {
        return objpasajero;
    }

    public void setObjpasajero(Pasajero objpasajero) {
        this.objpasajero = objpasajero;
    }

    public String getId_Vuelo() {
        return Id_Vuelo;
    }

    public void setId_Vuelo(String Id_Vuelo) {
        this.Id_Vuelo = Id_Vuelo;
    }

}
