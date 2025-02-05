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
public class Avion {

    //Declaracion de atributos
    public String Marca;
    public Fuselaje objFuselaje;
    public ArrayList<Motor> list_motores;
    public ArrayList<Ala> list_alas;
    public ArrayList<Llanta> list_llantas;

    //Constructor no parametrizado
    public Avion() {
    }

    //Constructor parametrizado
    public Avion(String Marca, Fuselaje objFuselaje, ArrayList<Motor> list_motores, ArrayList<Ala> list_alas, ArrayList<Llanta> list_llantas) {
        this.Marca = Marca;
        this.objFuselaje = objFuselaje;
        this.list_motores = list_motores;
        this.list_alas = list_alas;
        this.list_llantas = list_llantas;
    }

    //Setters y getters
    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public Fuselaje getObjFuselaje() {
        return objFuselaje;
    }

    public void setObjFuselaje(Fuselaje objFuselaje) {
        this.objFuselaje = objFuselaje;
    }

    public ArrayList<Motor> getList_motores() {
        return list_motores;
    }

    public void setList_motores(ArrayList<Motor> list_motores) {
        this.list_motores = list_motores;
    }

    public ArrayList<Ala> getList_alas() {
        return list_alas;
    }

    public void setList_alas(ArrayList<Ala> list_alas) {
        this.list_alas = list_alas;
    }

    public ArrayList<Llanta> getList_llantas() {
        return list_llantas;
    }

    public void setList_llantas(ArrayList<Llanta> list_llantas) {
        this.list_llantas = list_llantas;
    }

}
