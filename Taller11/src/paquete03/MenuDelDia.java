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

    public MenuDelDia(String nompl, double vi, double p, double b) {
        super(nompl, vi);
        postre = p;
        bebida = b;
    }

    public void establecervalorPostre(double c) {
        postre = c;
    }

    public void establecervalorBebida(double c) {
        bebida = c;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicial + postre + bebida;
    }

    public double obtenervalorPostre() {
        return postre;
    }

    public double obtenervalorBebida() {
        return bebida;
    }
    
    public double obtenerValorcancelartotal() {
        return valorMenu;
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
                obtenervalorPostre(),
                obtenervalorBebida(),
                obtenerValorMenu());

        return reporte;
    }
}
