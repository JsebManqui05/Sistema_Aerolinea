/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import Logica_Negocio.Ala;
import Logica_Negocio.Llanta;
import Logica_Negocio.Motor;
import Logica_Negocio.Vuelo;
import java.util.ArrayList;

/**
 *
 * @author Sebastian Manquillo
 */
public class HelperImpresion implements IHelperImpresion {

    @Override
    //Funcion para Imprimir tiket
    public void ImprimirInfoVuelo(Vuelo objvuelo) {
        ArrayList<Motor> list_motores;
        ArrayList<Ala> list_alas;
        ArrayList<Llanta> list_llantas;

        System.out.println("--------------------- TICKET ---------------------");
        System.out.println("\n");
        System.out.println("***** Vuelo *****");
        System.out.println("Identificador del vuelo: " + "\t" + objvuelo.getId_Vuelo());
        System.out.println("Aerolinea: " + "\t" + objvuelo.getAerolinea());
        System.out.println("Fecha: " + "\t" + objvuelo.getObjfecha().getObjdia().getDia() + " " + objvuelo.getObjfecha().getObjmes().getMes() + " " + objvuelo.getObjfecha().getObjaño().getAño());
        System.out.println("\n");
        System.out.println("***** Pasajero *****");
        System.out.println("Nombre del pasajero: : " + "\t" + objvuelo.getObjpasajero().getNombre() + " " + objvuelo.getObjpasajero().getApellido());
        System.out.println("Identificacion del pasajero: " + "\t" + objvuelo.getObjpasajero().getIdentificacion());
        System.out.println("Codigo del pasajero: " + "\t" + objvuelo.getObjpasajero().getCodigo_Cliente());
        System.out.println("Silla: " + "\t" + objvuelo.getObjpasajero().getNum_Silla());
        System.out.println("\n");
        System.out.println("***** Aeronave *****");
        System.out.println("Marca de la aeronave: " + "\t" + objvuelo.getObjavion().getMarca());
        System.out.println("Tipo de fuselaje: " + "\t" + objvuelo.getObjavion().getObjFuselaje().getNombre());

        list_alas = objvuelo.getObjavion().getList_alas();
        list_llantas = objvuelo.getObjavion().getList_llantas();
        list_motores = objvuelo.getObjavion().getList_motores();

        System.out.println("\n");
        System.out.println("***** Detalles de la Aeronave *****");

        for (int i = 0; i < list_alas.size(); i++) {
            System.out.println("Ala " + (i + 1) + ": " + list_alas.get(i).getPosicion());
        }
        System.out.println("\n");

        for (int i = 0; i < list_llantas.size(); i++) {
            System.out.println("Llanta " + (i + 1) + ": " + list_llantas.get(i).getTamaño_Llanta());
        }
        System.out.println("\n");

        for (int i = 0; i < list_motores.size(); i++) {
            System.out.println("Motor " + (i + 1) + ": " + list_motores.get(i).getTamaño_Motor());
        }
        System.out.println("\n");
        System.out.println("--------------------------------------------------");

    }

    public static void ImprimirInfoVueloAdapter(Vuelo vuelo) {
        HelperImpresion objHelperImpresion = new HelperImpresion();
        objHelperImpresion.ImprimirInfoVuelo(vuelo);
    }

}
