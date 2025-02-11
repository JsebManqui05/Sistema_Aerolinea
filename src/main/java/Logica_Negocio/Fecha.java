/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author Sebastian Manquillo
 */
public class Fecha {

    //Declaracion de atributos
    public Dia objdia;
    public Mes objmes;
    public Año objaño;

    //Constructor no parametrizado
    public Fecha() {
    }

    //Constructor parametrizado
    public Fecha(Dia objdia, Mes objmes, Año objaño) {
        this.objdia = objdia;
        this.objmes = objmes;
        this.objaño = objaño;
    }

    //Setters and getters
    public Dia getObjdia() {
        return objdia;
    }

    public void setObjdia(Dia objdia) {
        this.objdia = objdia;
    }

    public Mes getObjmes() {
        return objmes;
    }

    public void setObjmes(Mes objmes) {
        this.objmes = objmes;
    }

    public Año getObjaño() {
        return objaño;
    }

    public void setObjaño(Año objaño) {
        this.objaño = objaño;
    }

}
