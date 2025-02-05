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
    public ArrayList<Pasajero> list_pasajeros;
    public int Id_Vuelo;

    //Constructor no parametrizado
    public Vuelo() {
    }

    //Constuctor parametrizado

    public Vuelo(String Aerolinea, Avion objavion, ArrayList<Pasajero> list_pasajeros, int Id_Vuelo) {
        this.Aerolinea = Aerolinea;
        this.objavion = objavion;
        this.list_pasajeros = list_pasajeros;
        this.Id_Vuelo = Id_Vuelo;
    }
    
    //Setters and getters

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

    public ArrayList<Pasajero> getList_pasajeros() {
        return list_pasajeros;
    }

    public void setList_pasajeros(ArrayList<Pasajero> list_pasajeros) {
        this.list_pasajeros = list_pasajeros;
    }

    public int getId_Vuelo() {
        return Id_Vuelo;
    }

    public void setId_Vuelo(int Id_Vuelo) {
        this.Id_Vuelo = Id_Vuelo;
    }
    
}
