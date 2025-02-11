/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import java.util.ArrayList;

/**
 *
 * @author Sebastian Manquillo
 */
public class HelperValidacion {

    //Validar numeros en una cadena de texto
    public static int RetornaValor(String Texto) {
        int numero = 0;
        int letra = 0;

        char[] ch = new char[Texto.length()];
        for (int i = 0; i < Texto.length(); i++) {
            ch[i] = Texto.charAt(i);
            Boolean flag = Character.isDigit(ch[i]);
            if (flag) {
                numero++;
            } else {
                letra++;
            }
        }

        return numero;
    }

    //Validar vacio
    public static int ValidarVacio(String cadena) {
        if (cadena.equals("")) {
            return 1;
        } else {
            return 0;
        }
    }

    //Validar letras en un numero
    public static int RetornarValorLetra(String Texto) {
        int Letra = 0;

        for (int i = 0; i < Texto.length(); i++) {
            char caracter = Texto.charAt(i);
            if (Character.isLetter(caracter)) {
                Letra++;
            }
        }
        return Letra;
    }

    //Validar caracteres especiales
    public static int RetornarValorCEV2(String Texto) {
        int Caracter = 0;
        ArrayList<Character> Lista_caracter = new ArrayList<>();

        Lista_caracter.add('@');
        Lista_caracter.add(';');
        Lista_caracter.add(',');
        Lista_caracter.add('.');
        Lista_caracter.add('+');
        Lista_caracter.add('_');
        Lista_caracter.add('*');
        Lista_caracter.add('~');
        Lista_caracter.add('/');
        Lista_caracter.add('"');
        Lista_caracter.add(':');
        Lista_caracter.add('!');
        Lista_caracter.add('=');
        Lista_caracter.add('#');

        for (int i = 0; i < Texto.length(); i++) {
            boolean flag = Character.isLetter(Texto.charAt(i));
            if (!flag) {
                for (int j = 0; j < Lista_caracter.size(); j++) {
                    if (Lista_caracter.get(j).compareTo(Texto.charAt(i)) == 0) {
                        Caracter++;
                    }
                }
            }
        }

        return Caracter;
    }

}
