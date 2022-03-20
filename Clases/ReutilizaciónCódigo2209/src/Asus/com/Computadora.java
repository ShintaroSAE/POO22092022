package Asus.com;

import IcoFesComponentes.Monitor;
import IcoFesComponentes.Mouse;
import IcoFesComponentes.Procesador;
import IcoFesComponentes.Teclado;

/**
 * @author Eduardo Salazar
 */
public class Computadora {
    private String marca;
    private String modelo;
    private Monitor pantalla;
    private Mouse ratón;
    private Procesador cpu;
    private Teclado teclado;

    public Computadora() {
        
    }

    public Computadora(String marca, String modelo, Monitor pantalla, Mouse ratón, Procesador cpu, Teclado teclado) {
        this.marca = marca;
        this.modelo = modelo;
        this.pantalla = pantalla;
        this.ratón = ratón;
        this.cpu = cpu;
        this.teclado = teclado;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Monitor getPantalla() {
        return pantalla;
    }

    public void setPantalla(Monitor pantalla) {
        this.pantalla = pantalla;
    }

    public Mouse getRatón() {
        return ratón;
    }

    public void setRatón(Mouse ratón) {
        this.ratón = ratón;
    }

    public Procesador getCpu() {
        return cpu;
    }

    public void setCpu(Procesador cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        /*String estado ="Marca: " + this.marca + "\n";
        estado = estado + "Modelo: " + this.modelo + "\n";
        estado = estado + "Ratón: Marca " + this.ratón.getMarca() + ", Tipo: " + this.getRatón().getTipo() + "\n";
        
        return estado;*/
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + ", pantalla=" + pantalla + ", rat\u00f3n=" + ratón + ", cpu=" + cpu + ", teclado=" + teclado + '}';
    }
    
    
}
