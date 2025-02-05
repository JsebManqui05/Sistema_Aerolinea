/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Ala;
import Logica_Negocio.Avion;
import Logica_Negocio.Fuselaje;
import Logica_Negocio.Llanta;
import Logica_Negocio.Motor;
import Logica_Negocio.Pasajero;
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
        String Codigo_Cliente = "", Nombre = "", Apellido = "";
        int Identificacion = 0;

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

        Pasajero objpasajero;
        Avion objavion;
        Fuselaje objfuselaje;
        Llanta objllanta;
        Motor objmotor;
        Ala objala;

        //Solicitar informacion
        System.out.println("******** INFORMACION DEL PASAJERO **********");
        System.out.println("\n");
        System.out.println("Ingrese el codigo de cliente del pasajero: ");
        Codigo_Cliente = scan.nextLine();

        System.out.println("Ingrese el nombre del pasajero: ");
        Nombre = scan.nextLine();

        System.out.println("Ingrese el apellido del pasajero: ");
        Apellido = scan.nextLine();

        System.out.println("Ingrese el numero de indentificacion del pasajero: ");
        Identificacion = scan.nextInt();
        System.out.println("\n");
        scan.nextLine();

        System.out.println("******** INFORMACION DEL AVION **********");
        System.out.println("\n");
        System.out.println("Ingrese la marca del avion: ");
        Marca = scan.nextLine();

        System.out.println("Ingrese el tipo del suselaje: ");
        Nombre_fuselaje = scan.nextLine();
        objfuselaje = new Fuselaje(Nombre);

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
            System.out.println("Ingrese la posicion del ala " + 1 + i + ":");
            Posicion = scan.nextLine();
            objala = new Ala(Posicion);
            list_alas.add(objala);

        }
    }

}
