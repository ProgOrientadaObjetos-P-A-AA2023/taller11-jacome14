/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import paquete02.Menu;

/**
 *
 * @author jacom
 */
public class MenuCarta extends Menu {

    private double guarnicion;
    private double bebida;
    private double porcAdic;

    public MenuCarta(String nompl, double vi, double g, double b, double porcA) {
        super(nompl, vi);
        guarnicion = g;
        bebida = b;
        porcAdic =porcA;

    }

    public void establecerGuarnicion(double g) {
        guarnicion = g;
    }

    public void establecerBebida(double b) {
        bebida = b;
    }

    public void establecerPorcentajeAdicional(double pA) {
        porcAdic = pA;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = (valorInicial + guarnicion + bebida) + (valorInicial * porcAdic / 100);

    }

    public double obtenerGuarnicion() {
        return guarnicion;
    }

    public double obtenerBebida() {
        return bebida;
    }

    public double obtenerPorcentajeAdicional() {
        return porcAdic;
    }

    @Override
    public double obtenerValorMenu() {
        return valorMenu;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu de la Carta\n"
                + "\tPlato: %s\n"
                + "\tValor inicial : %.2f\n"
                + "\tValor Guarnición: %.2f\n"
                + "\tValor Bebida: %.2f\n"
                + "\tPorcentaje por servicio: %.2f\n"
                + "\tValor del Menú: %.2f\n",
                obtenerNombrePlato(),
                obtenerValorMenuInicial(),
                obtenerGuarnicion(),
                obtenerBebida(),
                obtenerPorcentajeAdicional(),
                obtenerValorMenu());

        return cadena;
    }
}
