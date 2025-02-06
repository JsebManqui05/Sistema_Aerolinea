/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Helpers.HelperImpresion;
import Helpers.IHelperImpresion;
import Logica_Negocio.Ala;
import Logica_Negocio.Avion;
import Logica_Negocio.Fuselaje;
import Logica_Negocio.Llanta;
import Logica_Negocio.Motor;
import Logica_Negocio.Pasajero;
import Logica_Negocio.PasajeroComun;
import Logica_Negocio.PasajeroVip;
import Logica_Negocio.Vuelo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sebastian Manquillo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaracion de variables
        //Pasajero
        String Codigo_Cliente = "", Nombre = "", Apellido = "", Num_silla = "";
        int Identificacion = 0;
        int TipoPasajero = 0;

        //Avion
        String Marca = "";
        ArrayList<Motor> list_motores = new ArrayList<>();
        ArrayList<Ala> list_alas = new ArrayList<>();
        ArrayList<Llanta> list_llantas = new ArrayList<>();

        //LLanta
        int cant_llantas = 0;
        String Tamaño_Llanta = "";

        //Motor
        int cant_motor = 0;
        String Tamaño_Motor = "";

        //Fuselaje
        String Nombre_fuselaje = "";

        //Ala
        int cant_alas = 0;
        String Posicion = "";

        //Scanner
        Scanner scan = new Scanner(System.in);

        //Vuelo
        String Aerolinea = "";
        int Id_Vuelo = 0;

        Pasajero objpasajero;
        Avion objavion;
        Fuselaje objfuselaje;
        Llanta objllanta;
        Motor objmotor;
        Ala objala;

        //Solicitar informacion del pasajero
        System.out.println("-------- INFORMACION DEL PASAJERO --------");
        System.out.println("\n");
        System.out.println("Ingrese el codigo de cliente del pasajero: ");
        Codigo_Cliente = scan.nextLine();

        System.out.println("Ingrese el nombre del pasajero: ");
        Nombre = scan.nextLine();

        System.out.println("Ingrese el apellido del pasajero: ");
        Apellido = scan.nextLine();
        
        System.out.println("Ingrese el numero de silla del pasajero: ");
        Num_silla = scan.nextLine();

        System.out.println("Ingrese el numero de indentificacion del pasajero: ");
        Identificacion = scan.nextInt();
        scan.nextLine();
        System.out.println("\n");

        //Elegir el tipo de pasajero
        do {
            System.out.println("Seleccione el tipo de pasajero: ");
            System.out.println("1. Pasajero Comun");
            System.out.println("2. Pasajero VIP");
            TipoPasajero = scan.nextInt();
            scan.nextLine();
        } while (TipoPasajero != 1 && TipoPasajero != 2);

        //Solicitar la infromacion del avion
        System.out.println("-------- INFORMACION DEL AVION --------");
        System.out.println("\n");
        System.out.println("Ingrese la marca del avion: ");
        Marca = scan.nextLine();

        System.out.println("Ingrese el tipo del fuselaje: ");
        Nombre_fuselaje = scan.nextLine();
        objfuselaje = new Fuselaje(Nombre_fuselaje);

        System.out.println("Ingrese el numero de motores del avion");
        cant_motor = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < cant_motor; i++) {
            System.out.println("Ingrese el tamaño del motor " + (i + 1) + ":");
            Tamaño_Motor = scan.nextLine();
            objmotor = new Motor(Tamaño_Motor);
            list_motores.add(objmotor);

        }

        System.out.println("Ingrese el numero de llantas del avion");
        cant_llantas = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < cant_llantas; i++) {
            System.out.println("Ingrese el tamaño de la llanta " + (i + 1) + ":");
            Tamaño_Llanta = scan.nextLine();
            objllanta = new Llanta(Tamaño_Llanta);
            list_llantas.add(objllanta);

        }

        System.out.println("Ingrese el numero de alas del avion");
        cant_alas = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < cant_alas; i++) {
            System.out.println("Ingrese la posicion del ala " + (i + 1) + ":");
            Posicion = scan.nextLine();
            objala = new Ala(Posicion);
            list_alas.add(objala);

        }

        //Creacion del objeto avion
        objavion = new Avion(Marca, objfuselaje, list_motores, list_alas, list_llantas);

        //Solicitar la informacion del vuelo
        System.out.println("-------- INFORMACION DEL VUELO --------");
        System.out.println("\n");
        System.out.println("Ingrese la Aerolinea del vuelo: ");
        Aerolinea = scan.nextLine();

        System.out.println("Ingrese el identificador del vuelo: ");
        Id_Vuelo = scan.nextInt();
        scan.nextLine();

        //Creacion del objeto pasajero
        if (TipoPasajero == 1) {
            objpasajero = new PasajeroComun(Codigo_Cliente, Nombre, Apellido, Num_silla, Identificacion);

        } else {
            objpasajero = new PasajeroVip(Codigo_Cliente, Nombre, Apellido, Num_silla, Identificacion);
        }

        //Creacion del objeto Vuelo
        Vuelo objvuelo = new Vuelo(Aerolinea, objavion, objpasajero, Id_Vuelo);

        //Creo una instancia de helper impresion usando la interfaz
        IHelperImpresion helper = new HelperImpresion();

        //Imprimir ticket
        helper.ImprimirInfoVuelo(objvuelo);

        //System.out.println("\n******** RESUMEN DEL VUELO **********");
        //System.out.println("Aerolínea: " + Aerolinea);
        //System.out.println("ID del vuelo: " + Id_Vuelo);
        //System.out.println("Pasajero: " + Nombre + " " + Apellido + " (ID: " + Identificacion + ")");
        //System.out.println("Avión: " + Marca + " con " + cant_motor + " motores, " + cant_alas + " alas y " + cant_llantas + " llantas.");
    }

}
