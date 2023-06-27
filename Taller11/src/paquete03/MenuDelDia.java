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
public class MenuDelDia extends Menu {

    private double bebida;
    private double postre;

    public MenuDelDia(String cade, double vi, double p, double b) {
        super(cade, vi);
        postre = p;
        bebida = b;
    }

    public void establecerPostre(double c) {
        postre = c;
    }

    public void establecerBebida(double c) {
        bebida = c;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicial + postre + bebida;
    }

    public double obtenerPostre() {
        return postre;
    }

    public double obtenerBebida() {
        return bebida;
    }

    @Override
    public String toString() {
        String reporte = String.format("Menú del Día\n"
                + "\tPlato: %s\n"
                + "\tValor Inicial : %.2f\n"
                + "\tValor postre: %.2f\n"
                + "\tValor bebida: %.2f\n"
                + "\tValor del Menú: %.2f\n",
                obtenerNombrePlato(),
                obtenerValorMenuInicial(),
                obtenerPostre(),
                obtenerBebida(),
                obtenerValorMenu());

        return reporte;
    }
}
