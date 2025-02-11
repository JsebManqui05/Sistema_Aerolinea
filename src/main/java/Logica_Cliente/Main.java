/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Helpers.HelperImpresion;
import Helpers.HelperValidacion;
import Helpers.IHelperImpresion;
import Logica_Negocio.Ala;
import Logica_Negocio.Avion;
import Logica_Negocio.Año;
import Logica_Negocio.Dia;
import Logica_Negocio.Fecha;
import Logica_Negocio.Fuselaje;
import Logica_Negocio.Llanta;
import Logica_Negocio.Mes;
import Logica_Negocio.Motor;
import Logica_Negocio.Pasajero;
import Logica_Negocio.PasajeroComun;
import Logica_Negocio.PasajeroVip;
import Logica_Negocio.Vuelo;
import java.util.ArrayList;
import java.util.InputMismatchException;
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
        String Codigo_Cliente = "", Nombre = "", Apellido = "", Num_silla = "", Identificacion = "", TipoPasajero = "";

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
        String Id_Vuelo = "";

        //Fecha
        String dia = "";
        String mes = "";
        String año = "";

        //Validaciones
        int retorno_num = 0, retorno_ce = 0, retorno_letra = 0, retorno_vac = 0;

        Pasajero objpasajero;
        Avion objavion;
        Fuselaje objfuselaje;
        Llanta objllanta;
        Motor objmotor;
        Ala objala;
        Fecha objfecha;
        Dia objdia;
        Mes objmes;
        Año objaño;

        //Solicitar informacion del pasajero
        System.out.println("-------- INFORMACION DEL PASAJERO --------");
        System.out.println("\n");

        //Inicio codigo de cliente
        System.out.println("Ingrese el codigo de cliente del pasajero: ");
        Codigo_Cliente = scan.nextLine();

        retorno_vac = HelperValidacion.ValidarVacio(Codigo_Cliente);
        while (retorno_vac != 0) {
            System.out.println("Ingrese el codigo de cliente del pasajero: ");
            Codigo_Cliente = scan.nextLine();

            retorno_vac = HelperValidacion.ValidarVacio(Codigo_Cliente);
        }

        retorno_vac = HelperValidacion.ValidarVacio(Codigo_Cliente);
        retorno_ce = HelperValidacion.RetornarValorCEV2(Codigo_Cliente);
        while (retorno_ce != 0 || retorno_vac != 0) {
            System.out.println("Ingrese el codigo de cliente del pasajero: ");
            Codigo_Cliente = scan.nextLine();

            retorno_vac = HelperValidacion.ValidarVacio(Codigo_Cliente);
            retorno_ce = HelperValidacion.RetornarValorCEV2(Codigo_Cliente);
        }
        //Fin Codigo de cliente

        //Inicio nombre
        System.out.println("Ingrese el nombre del pasajero: ");
        Nombre = scan.nextLine();

        retorno_vac = HelperValidacion.ValidarVacio(Nombre);
        while (retorno_vac != 0) {
            System.out.println("Ingrese el nombre del pasajero: ");
            Nombre = scan.nextLine();

            retorno_vac = HelperValidacion.ValidarVacio(Nombre);
        }

        retorno_vac = HelperValidacion.ValidarVacio(Nombre);
        retorno_num = HelperValidacion.RetornaValor(Nombre);
        retorno_ce = HelperValidacion.RetornarValorCEV2(Nombre);

        while (retorno_num != 0 || retorno_ce != 0 || retorno_vac != 0) {
            System.out.println("Ingrese el nombre del pasajero: ");
            Nombre = scan.nextLine();

            retorno_vac = HelperValidacion.ValidarVacio(Nombre);
            retorno_num = HelperValidacion.RetornaValor(Nombre);
            retorno_ce = HelperValidacion.RetornarValorCEV2(Nombre);
        }
        //Fin nombre

        //Inicio Apellido
        System.out.println("Ingrese el apellido del pasajero: ");
        Apellido = scan.nextLine();

        retorno_vac = HelperValidacion.ValidarVacio(Apellido);
        while (retorno_vac != 0) {
            System.out.println("Ingrese el apellido del pasajero: ");
            Apellido = scan.nextLine();

            retorno_vac = HelperValidacion.ValidarVacio(Apellido);
        }

        retorno_vac = HelperValidacion.ValidarVacio(Apellido);
        retorno_num = HelperValidacion.RetornaValor(Apellido);
        retorno_ce = HelperValidacion.RetornarValorCEV2(Apellido);

        while (retorno_num != 0 || retorno_ce != 0 || retorno_vac != 0) {
            System.out.println("Ingrese el apellido del pasajero: ");
            Apellido = scan.nextLine();

            retorno_vac = HelperValidacion.ValidarVacio(Apellido);
            retorno_num = HelperValidacion.RetornaValor(Apellido);
            retorno_ce = HelperValidacion.RetornarValorCEV2(Apellido);
        }
        //Fin apellido

        //Inicio numero de silla
        System.out.println("Ingrese el numero de silla del pasajero: ");
        Num_silla = scan.nextLine();

        retorno_vac = HelperValidacion.ValidarVacio(Num_silla);
        while (retorno_vac != 0) {
            System.out.println("Ingrese el numero de silla del pasajero: ");
            Num_silla = scan.nextLine();

            retorno_vac = HelperValidacion.ValidarVacio(Num_silla);
        }

        retorno_vac = HelperValidacion.ValidarVacio(Num_silla);
        retorno_ce = HelperValidacion.RetornarValorCEV2(Num_silla);
        while (retorno_ce != 0 || retorno_vac != 0) {
            System.out.println("Ingrese el numero de silla del pasajero: ");
            Num_silla = scan.nextLine();

            retorno_vac = HelperValidacion.ValidarVacio(Num_silla);
            retorno_ce = HelperValidacion.RetornarValorCEV2(Num_silla);

        }
        //Fin numero de silla

        //Inicio identificacion
        System.out.println("Ingrese el numero de indentificacion del pasajero: ");
        Identificacion = scan.nextLine();

        retorno_vac = HelperValidacion.ValidarVacio(Identificacion);
        while (retorno_vac != 0) {
            System.out.println("Ingrese el numero de indentificacion del pasajero: ");
            Identificacion = scan.nextLine();

            retorno_vac = HelperValidacion.ValidarVacio(Identificacion);
        }

        retorno_letra = HelperValidacion.RetornarValorLetra(Identificacion);
        retorno_vac = HelperValidacion.ValidarVacio(Identificacion);
        retorno_ce = HelperValidacion.RetornarValorCEV2(Identificacion);
        while (retorno_letra != 0 || retorno_ce != 0 || retorno_vac != 0) {
            System.out.println("Ingrese el numero de indentificacion del pasajero: ");
            Identificacion = scan.nextLine();

            retorno_letra = HelperValidacion.RetornarValorLetra(Identificacion);
            retorno_vac = HelperValidacion.ValidarVacio(Identificacion);
            retorno_ce = HelperValidacion.RetornarValorCEV2(Identificacion);
        }
        System.out.println("\n");
        //Fin identificacion

        //Elegir el tipo de pasajero
        System.out.println("Seleccione el tipo de pasajero: ");
        System.out.println("1. Pasajero Comun");
        System.out.println("2. Pasajero VIP");
        TipoPasajero = scan.nextLine();

        retorno_vac = HelperValidacion.ValidarVacio(TipoPasajero);
        while (retorno_vac != 0) {
            System.out.println("Seleccione el tipo de pasajero: ");
            System.out.println("1. Pasajero Comun");
            System.out.println("2. Pasajero VIP");

            TipoPasajero = scan.nextLine();
            retorno_vac = HelperValidacion.ValidarVacio(TipoPasajero);
        }

        retorno_letra = HelperValidacion.RetornarValorLetra(TipoPasajero);
        retorno_vac = HelperValidacion.ValidarVacio(TipoPasajero);
        retorno_ce = HelperValidacion.RetornarValorCEV2(TipoPasajero);
        while (retorno_letra != 0 || retorno_ce != 0 || retorno_vac != 0) {
            System.out.println("Seleccione el tipo de pasajero: ");
            System.out.println("1. Pasajero Comun");
            System.out.println("2. Pasajero VIP");
            TipoPasajero = scan.nextLine();

            retorno_letra = HelperValidacion.RetornarValorLetra(TipoPasajero);
            retorno_vac = HelperValidacion.ValidarVacio(TipoPasajero);
            retorno_ce = HelperValidacion.RetornarValorCEV2(TipoPasajero);
        }
        //Fin tipo de pasajero

        //Solicitar la infromacion del avion
        System.out.println("-------- INFORMACION DEL AVION --------");
        System.out.println("\n");

        //Inicio marca
        System.out.println("Ingrese la marca del avion: ");
        Marca = scan.nextLine();

        retorno_vac = HelperValidacion.ValidarVacio(Marca);
        while (retorno_vac != 0) {
            System.out.println("Ingrese la marca del avion: ");
            Marca = scan.nextLine();

            retorno_vac = HelperValidacion.ValidarVacio(Marca);
        }

        retorno_vac = HelperValidacion.ValidarVacio(Marca);
        retorno_ce = HelperValidacion.RetornarValorCEV2(Marca);

        while (retorno_ce != 0 || retorno_vac != 0) {
            System.out.println("Ingrese la marca del avion: ");
            Marca = scan.nextLine();

            retorno_vac = HelperValidacion.ValidarVacio(Marca);
            retorno_ce = HelperValidacion.RetornarValorCEV2(Marca);
        }
        //Fin marca

        //Inicio fuselaje
        System.out.println("Ingrese el tipo del fuselaje: ");
        Nombre_fuselaje = scan.nextLine();

        retorno_vac = HelperValidacion.ValidarVacio(Nombre_fuselaje);
        while (retorno_vac != 0) {
            System.out.println("Ingrese el tipo del fuselaje: ");
            Nombre_fuselaje = scan.nextLine();

            retorno_vac = HelperValidacion.ValidarVacio(Nombre_fuselaje);
        }

        retorno_vac = HelperValidacion.ValidarVacio(Nombre_fuselaje);
        retorno_num = HelperValidacion.RetornaValor(Nombre_fuselaje);
        retorno_ce = HelperValidacion.RetornarValorCEV2(Nombre_fuselaje);

        while (retorno_num != 0 || retorno_ce != 0 || retorno_vac != 0) {
            System.out.println("Ingrese el tipo del fuselaje: ");
            Nombre_fuselaje = scan.nextLine();

            retorno_vac = HelperValidacion.ValidarVacio(Nombre_fuselaje);
            retorno_num = HelperValidacion.RetornaValor(Nombre_fuselaje);
            retorno_ce = HelperValidacion.RetornarValorCEV2(Nombre_fuselaje);
        }
        //Fin fuselaje

        objfuselaje = new Fuselaje(Nombre_fuselaje);

        //Inicio numero de motores
        do {
            System.out.println("Ingrese el numero de motores del avion: ");
            String inputMotor = scan.nextLine();

            retorno_vac = HelperValidacion.ValidarVacio(inputMotor);
            while (retorno_vac != 0) {
                System.out.println("Ingrese el numero de motores del avion: ");
                inputMotor = scan.nextLine();

                retorno_vac = HelperValidacion.ValidarVacio(inputMotor);
            }

            retorno_vac = HelperValidacion.ValidarVacio(inputMotor);
            retorno_letra = HelperValidacion.RetornarValorLetra(inputMotor);
            retorno_ce = HelperValidacion.RetornarValorCEV2(inputMotor);
            while (retorno_vac != 0 || retorno_letra != 0 || retorno_ce != 0) {
                System.out.println("Ingrese un numero válido de motores del avion: ");
                inputMotor = scan.nextLine();

                retorno_vac = HelperValidacion.ValidarVacio(inputMotor);
                retorno_letra = HelperValidacion.RetornarValorLetra(inputMotor);
                retorno_ce = HelperValidacion.RetornarValorCEV2(inputMotor);

            }

            cant_motor = Integer.parseInt(inputMotor);

            if (cant_motor < 1 || cant_motor > 12) {
                System.out.println("El número de motores debe estar entre 1 y 12.");
            }
        } while (cant_motor < 1 || cant_motor > 12);

        for (int i = 0; i < cant_motor; i++) {
            System.out.println("Ingrese el tamaño del motor " + (i + 1) + ":");
            Tamaño_Motor = scan.nextLine();

            //Validacion tamaño de motor/es
            retorno_vac = HelperValidacion.ValidarVacio(Tamaño_Motor);
            while (retorno_vac != 0) {
                System.out.println("Ingrese el tamaño del motor " + (i + 1) + ":");
                Tamaño_Motor = scan.nextLine();

                retorno_vac = HelperValidacion.ValidarVacio(Tamaño_Motor);
            }

            retorno_vac = HelperValidacion.ValidarVacio(Tamaño_Motor);
            retorno_ce = HelperValidacion.RetornarValorCEV2(Tamaño_Motor);
            retorno_num = HelperValidacion.RetornaValor(Tamaño_Motor);
            while (retorno_ce != 0 || retorno_vac != 0 || retorno_num != 0) {
                System.out.println("Ingrese el tamaño del motor " + (i + 1) + ":");
                Tamaño_Motor = scan.nextLine();

                retorno_vac = HelperValidacion.ValidarVacio(Tamaño_Motor);
                retorno_ce = HelperValidacion.RetornarValorCEV2(Tamaño_Motor);
                retorno_num = HelperValidacion.RetornaValor(Tamaño_Motor);

            }
            objmotor = new Motor(Tamaño_Motor);
            list_motores.add(objmotor);

        }
        //Fin motores

        //Inicio de número de llantas
        do {
            System.out.println("Ingrese el numero de llantas del avion: ");
            String inputLlanta = scan.nextLine();

            retorno_vac = HelperValidacion.ValidarVacio(inputLlanta);
            while (retorno_vac != 0) {
                System.out.println("Ingrese el numero de llantas del avion: ");
                inputLlanta = scan.nextLine();

                retorno_vac = HelperValidacion.ValidarVacio(inputLlanta);
            }

            retorno_vac = HelperValidacion.ValidarVacio(inputLlanta);
            retorno_letra = HelperValidacion.RetornarValorLetra(inputLlanta);
            retorno_ce = HelperValidacion.RetornarValorCEV2(inputLlanta);
            while (retorno_vac != 0 || retorno_letra != 0 || retorno_ce != 0) {
                System.out.println("Ingrese un numero válido de llantas del avion: ");
                inputLlanta = scan.nextLine();

                retorno_vac = HelperValidacion.ValidarVacio(inputLlanta);
                retorno_letra = HelperValidacion.RetornarValorLetra(inputLlanta);
                retorno_ce = HelperValidacion.RetornarValorCEV2(inputLlanta);

            }

            cant_llantas = Integer.parseInt(inputLlanta);

            if (cant_llantas < 3 || cant_llantas > 32) {
                System.out.println("El número de llantas debe estar entre 3 y 32.");
            }
        } while (cant_llantas < 3 || cant_llantas > 32);

        for (int i = 0; i < cant_llantas; i++) {
            System.out.println("Ingrese el tamaño de la llanta " + (i + 1) + ":");
            Tamaño_Llanta = scan.nextLine();

            //Validacion tamaño de llanta/s
            retorno_vac = HelperValidacion.ValidarVacio(Tamaño_Llanta);
            while (retorno_vac != 0) {
                System.out.println("Ingrese el tamaño de la llanta " + (i + 1) + ":");
                Tamaño_Llanta = scan.nextLine();

                retorno_vac = HelperValidacion.ValidarVacio(Tamaño_Llanta);
            }

            retorno_vac = HelperValidacion.ValidarVacio(Tamaño_Llanta);
            retorno_ce = HelperValidacion.RetornarValorCEV2(Tamaño_Llanta);
            retorno_num = HelperValidacion.RetornaValor(Tamaño_Llanta);
            while (retorno_ce != 0 || retorno_vac != 0 || retorno_num != 0) {
                System.out.println("Ingrese el tamaño de la llanta " + (i + 1) + ":");
                Tamaño_Llanta = scan.nextLine();

                retorno_vac = HelperValidacion.ValidarVacio(Tamaño_Llanta);
                retorno_ce = HelperValidacion.RetornarValorCEV2(Tamaño_Llanta);
                retorno_num = HelperValidacion.RetornaValor(Tamaño_Llanta);

            }

            objllanta = new Llanta(Tamaño_Llanta);
            list_llantas.add(objllanta);

        }
        //Fin llantas

        //Inicio de número de alas
        do {
            System.out.println("Ingrese el numero de alas del avion: ");
            String inputAla = scan.nextLine();

            retorno_vac = HelperValidacion.ValidarVacio(inputAla);
            while (retorno_vac != 0) {
                System.out.println("Ingrese el numero de alas del avion: ");
                inputAla = scan.nextLine();

                retorno_vac = HelperValidacion.ValidarVacio(inputAla);
            }

            retorno_vac = HelperValidacion.ValidarVacio(inputAla);
            retorno_letra = HelperValidacion.RetornarValorLetra(inputAla);
            retorno_ce = HelperValidacion.RetornarValorCEV2(inputAla);
            while (retorno_vac != 0 || retorno_letra != 0 || retorno_ce != 0) {
                System.out.println("Ingrese un numero válido de alas del avion: ");
                inputAla = scan.nextLine();

                retorno_vac = HelperValidacion.ValidarVacio(inputAla);
                retorno_letra = HelperValidacion.RetornarValorLetra(inputAla);
                retorno_ce = HelperValidacion.RetornarValorCEV2(inputAla);

            }

            cant_alas = Integer.parseInt(inputAla);

            if (cant_alas < 2 || cant_alas > 12) {
                System.out.println("El número de alas debe estar entre 2 y 12.");
            }
        } while (cant_alas < 2 || cant_alas > 12);

        for (int i = 0; i < cant_alas; i++) {
            System.out.println("Ingrese la posicion del ala " + (i + 1) + ":");
            Posicion = scan.nextLine();

            //Validacion posicion de Alas
            retorno_vac = HelperValidacion.ValidarVacio(Posicion);
            while (retorno_vac != 0) {
                System.out.println("Ingrese la posicion del ala " + (i + 1) + ":");
                Posicion = scan.nextLine();

                retorno_vac = HelperValidacion.ValidarVacio(Posicion);
            }

            retorno_vac = HelperValidacion.ValidarVacio(Posicion);
            retorno_ce = HelperValidacion.RetornarValorCEV2(Posicion);
            retorno_num = HelperValidacion.RetornaValor(Posicion);
            while (retorno_ce != 0 || retorno_vac != 0 || retorno_num != 0) {
                System.out.println("Ingrese la posicion del ala " + (i + 1) + ":");
                Posicion = scan.nextLine();

                retorno_vac = HelperValidacion.ValidarVacio(Posicion);
                retorno_ce = HelperValidacion.RetornarValorCEV2(Posicion);
                retorno_num = HelperValidacion.RetornaValor(Posicion);

            }
            objala = new Ala(Posicion);
            list_alas.add(objala);

        }
        //Fin Alas

        //Creacion del objeto avion
        objavion = new Avion(Marca, objfuselaje, list_motores, list_alas, list_llantas);

        //Solicitar la informacion del vuelo
        System.out.println("-------- INFORMACION DEL VUELO --------");
        System.out.println("\n");

        //Inicio aerolinea
        System.out.println("Ingrese la Aerolinea del vuelo: ");
        Aerolinea = scan.nextLine();

        retorno_vac = HelperValidacion.ValidarVacio(Aerolinea);
        while (retorno_vac != 0) {
            System.out.println("Ingrese la Aerolinea del vuelo: ");
            Aerolinea = scan.nextLine();

            retorno_vac = HelperValidacion.ValidarVacio(Aerolinea);
        }

        retorno_vac = HelperValidacion.ValidarVacio(Aerolinea);
        retorno_ce = HelperValidacion.RetornarValorCEV2(Aerolinea);
        while (retorno_ce != 0 || retorno_vac != 0) {
            System.out.println("Ingrese la Aerolinea del vuelo: ");
            Aerolinea = scan.nextLine();

            retorno_vac = HelperValidacion.ValidarVacio(Aerolinea);
            retorno_ce = HelperValidacion.RetornarValorCEV2(Aerolinea);
        }
        //Fin aerolinea

        System.out.println("Ingrese el identificador del vuelo: ");
        Id_Vuelo = scan.nextLine();

        retorno_vac = HelperValidacion.ValidarVacio(Id_Vuelo);
        while (retorno_vac != 0) {
            System.out.println("Ingrese el identificador del vuelo: ");
            Id_Vuelo = scan.nextLine();
            retorno_vac = HelperValidacion.ValidarVacio(Id_Vuelo);
        }

        retorno_letra = HelperValidacion.RetornarValorLetra(Id_Vuelo);
        retorno_vac = HelperValidacion.ValidarVacio(Id_Vuelo);
        retorno_ce = HelperValidacion.RetornarValorCEV2(Id_Vuelo);
        while (retorno_letra != 0 || retorno_ce != 0 || retorno_vac != 0) {
            System.out.println("Ingrese el identificador del vuelo: ");
            Id_Vuelo = scan.nextLine();
            retorno_letra = HelperValidacion.RetornarValorLetra(Id_Vuelo);
            retorno_vac = HelperValidacion.ValidarVacio(Id_Vuelo);
            retorno_ce = HelperValidacion.RetornarValorCEV2(Id_Vuelo);
        }
        System.out.println("\n");
        //Fin Id vuelo

        //Inicio Fecha
        //dia
        System.out.println("Ingrese la fecha del vuelo.");
        System.out.println("Dia: ");
        dia = scan.nextLine();

        retorno_vac = HelperValidacion.ValidarVacio(dia);
        while (retorno_vac != 0) {
            System.out.println("Dia: ");
            dia = scan.nextLine();

            retorno_vac = HelperValidacion.ValidarVacio(dia);
        }

        retorno_vac = HelperValidacion.ValidarVacio(dia);
        retorno_ce = HelperValidacion.RetornarValorCEV2(dia);
        retorno_letra = HelperValidacion.RetornarValorLetra(dia);
        while (retorno_ce != 0 || retorno_vac != 0 || retorno_letra != 0) {
            System.out.println("Dia: ");
            dia = scan.nextLine();

            retorno_vac = HelperValidacion.ValidarVacio(dia);
            retorno_ce = HelperValidacion.RetornarValorCEV2(dia);
            retorno_letra = HelperValidacion.RetornarValorLetra(dia);
        }
        objdia = new Dia(dia);
        //Fin dia

        //mes
        System.out.println("Mes: ");
        mes = scan.nextLine();

        retorno_vac = HelperValidacion.ValidarVacio(mes);
        while (retorno_vac != 0) {
            System.out.println("Mes: ");
            mes = scan.nextLine();

            retorno_vac = HelperValidacion.ValidarVacio(mes);
        }

        retorno_vac = HelperValidacion.ValidarVacio(mes);
        retorno_ce = HelperValidacion.RetornarValorCEV2(mes);
        retorno_num = HelperValidacion.RetornaValor(mes);
        while (retorno_ce != 0 || retorno_vac != 0 || retorno_num != 0) {
            System.out.println("Mes: ");
            mes = scan.nextLine();

            retorno_vac = HelperValidacion.ValidarVacio(mes);
            retorno_ce = HelperValidacion.RetornarValorCEV2(mes);
            retorno_num = HelperValidacion.RetornaValor(mes);
        }
        objmes = new Mes(mes);
        //Fin mes

        //año
        System.out.println("Año: ");
        año = scan.nextLine();

        retorno_vac = HelperValidacion.ValidarVacio(año);
        while (retorno_vac != 0) {
            System.out.println("Año: ");
            año = scan.nextLine();

            retorno_vac = HelperValidacion.ValidarVacio(año);
        }

        retorno_vac = HelperValidacion.ValidarVacio(año);
        retorno_ce = HelperValidacion.RetornarValorCEV2(año);
        retorno_letra = HelperValidacion.RetornarValorLetra(año);
        while (retorno_ce != 0 || retorno_vac != 0 || retorno_letra != 0) {
            System.out.println("Año: ");
            año = scan.nextLine();

            retorno_vac = HelperValidacion.ValidarVacio(año);
            retorno_ce = HelperValidacion.RetornarValorCEV2(año);
            retorno_letra = HelperValidacion.RetornarValorLetra(año);
        }
        objaño = new Año(año);
        //Fin mes

        objfecha = new Fecha(objdia, objmes, objaño);
        //Fin fecha

        //Creacion del objeto pasajero
        if (TipoPasajero.equals(1)) {
            objpasajero = new PasajeroComun(Codigo_Cliente, Nombre, Apellido, Num_silla, Identificacion);

        } else {
            objpasajero = new PasajeroVip(Codigo_Cliente, Nombre, Apellido, Num_silla, Identificacion);
        }

        //Creacion del objeto Vuelo
        Vuelo objvuelo = new Vuelo(Aerolinea, objavion, objfecha, objpasajero, Id_Vuelo);

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
