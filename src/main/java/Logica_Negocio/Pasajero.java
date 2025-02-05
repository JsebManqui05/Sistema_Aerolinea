/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author Sebastian Manquillo
 */
public abstract class Pasajero {

    //Declaracion de atributos
    public String Codigo_Cliente;
    public String Nombre;
    public String Apellido;
    public int Identificacion;

    //Constructor no parametrizado
    public Pasajero() {
    }

    //Constructor parametrizado
    public Pasajero(String Codigo_Cliente, String Nombre, String Apellido, int Identificacion) {
        this.Codigo_Cliente = Codigo_Cliente;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Identificacion = Identificacion;
    }

    //Setters and getters
    public String getCodigo_Cliente() {
        return Codigo_Cliente;
    }

    public void setCodigo_Cliente(String Codigo_Cliente) {
        this.Codigo_Cliente = Codigo_Cliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(int Identificacion) {
        this.Identificacion = Identificacion;
    }

}
