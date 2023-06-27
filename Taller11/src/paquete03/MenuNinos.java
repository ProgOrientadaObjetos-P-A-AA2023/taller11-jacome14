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
public class MenuNinos extends Menu {

    private double helado;
    private double pastel;

    public MenuNinos(String cade, double vi, double h, double p) {
        super(cade, vi);
        helado = h;
        pastel = p;
    }

    public void establecerHelado(double c) {
        helado = c;
    }

    public void establecerPastel(double c) {
        pastel = c;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicial + helado + pastel;
    }

    public double obtenerHelado() {
        return helado;
    }

    public double obtenerPastel() {
        return pastel;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menú Del Dia \n"
                + "\tPlato: %s\n"
                + "\tValor Inicial : %.2f\n"
                + "\tValor helado: %.2f\n"
                + "\tValor Pastel: %.2f\n"
                + "\tValor del Menú: %.2f\n",
                obtenerNombrePlato(),
                obtenerValorMenuInicial(),
                obtenerHelado(),
                obtenerPastel(),
                obtenerValorMenu());

        return cadena;
    }
}
